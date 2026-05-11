package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.PriorityQueue;

/**
 * Programa principal que simula el sistema de atención de pacientes en una sala de emergencias
 * utilizando la implementación de PriorityQueue del Java Collection Framework.
 *
 * El programa lee un archivo de texto llamado "pacientes.txt", donde cada línea contiene
 * la información de un paciente en el formato:
 * nombre, sintoma, prioridad
 *
 * Luego, los pacientes son insertados en la cola de prioridad de Java y se atienden en orden
 * según su nivel de emergencia (A = mayor prioridad, E = menor prioridad).
 *
 * Autor: Kenett Ortega
 * Carnet: 25777
 * Universidad del Valle de Guatemala
 */
public class MainJavaPQ {

    /**
     * Método principal que ejecuta el programa.
     *
     * Lee el archivo de pacientes, inserta los datos en la PriorityQueue de Java
     * y luego imprime el orden en que los pacientes deben ser atendidos.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        PriorityQueue<Paciente> cola = new PriorityQueue<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"));
            String linea;

            /**
             * Lectura del archivo línea por línea.
             * Cada línea representa un paciente con sus datos separados por comas.
             */
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                String nombre = partes[0].trim();
                String sintoma = partes[1].trim();
                char prioridad = partes[2].trim().charAt(0);

                cola.add(new Paciente(nombre, sintoma, prioridad));
            }

            br.close();

        } catch (Exception e) {
            /**
             * Manejo de errores en caso de que el archivo no exista
             * o haya problemas durante la lectura.
             */
            e.printStackTrace();
        }

        System.out.println("Orden de atención (Java PQ):");

        /**
         * Se retiran los pacientes de la cola según su prioridad
         * y se imprimen en el orden en que deben ser atendidos.
         */
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}