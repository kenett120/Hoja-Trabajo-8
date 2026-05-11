package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.PriorityQueue;

public class MainJavaPQ {

    public static void main(String[] args) {

        PriorityQueue<Paciente> cola = new PriorityQueue<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                String nombre = partes[0].trim();
                String sintoma = partes[1].trim();
                char prioridad = partes[2].trim().charAt(0);

                cola.add(new Paciente(nombre, sintoma, prioridad));
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Orden de atención (Java PQ):");

        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
