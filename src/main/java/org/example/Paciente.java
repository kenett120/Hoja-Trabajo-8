package org.example;

/**
 * Clase que representa a un paciente en la sala de emergencias.
 *
 * Cada paciente contiene su nombre, el síntoma que presenta y un código
 * de prioridad que indica la urgencia con la que debe ser atendido.
 *
 * La prioridad se representa con una letra de la A a la E, donde:
 * A = mayor prioridad (atención inmediata)
 * E = menor prioridad
 *
 * Esta clase implementa Comparable para permitir ordenar los pacientes
 * en una cola de prioridad según su nivel de emergencia.
 *
 * Autor: Kenett Ortega
 * Carnet: 25777
 * Universidad del Valle de Guatemala
 */
public class Paciente implements Comparable<Paciente> {

    private String nombre;
    private String sintoma;
    private char prioridad;

    /**
     * Constructor de la clase Paciente.
     *
     * @param nombre nombre del paciente
     * @param sintoma descripción del síntoma del paciente
     * @param prioridad código de prioridad (A-E)
     */
    public Paciente(String nombre, String sintoma, char prioridad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.prioridad = prioridad;
    }

    /**
     * Obtiene el nombre del paciente.
     *
     * @return nombre del paciente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el síntoma del paciente.
     *
     * @return síntoma del paciente
     */
    public String getSintoma() {
        return sintoma;
    }

    /**
     * Obtiene la prioridad del paciente.
     *
     * @return prioridad del paciente (A-E)
     */
    public char getPrioridad() {
        return prioridad;
    }

    /**
     * Compara dos pacientes según su prioridad.
     *
     * Un paciente con prioridad 'A' será considerado menor que uno con 'B',
     * lo que permite que las colas de prioridad atiendan primero a los más urgentes.
     *
     * @param otro paciente con el que se compara
     * @return valor negativo si este paciente tiene mayor prioridad,
     *         cero si son iguales,
     *         valor positivo si tiene menor prioridad
     */
    @Override
    public int compareTo(Paciente otro) {
        return this.prioridad - otro.prioridad;
    }

    /**
     * Representación en texto del paciente.
     *
     * @return cadena con formato: "nombre, sintoma, prioridad"
     */
    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + prioridad;
    }
}