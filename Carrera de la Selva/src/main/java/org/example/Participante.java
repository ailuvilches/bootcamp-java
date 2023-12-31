package org.example;

import java.util.Random;

public class Participante {

    private int numero;
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int celular;
    private int numeroEmergencia;
    private String grupoSanguineo;

    public Participante(String nombre, String apellido, int edad) {
        this.numero = new Random().nextInt(1000);
        this.dni = 0;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = 0;
        this.numeroEmergencia = 0;
        this.grupoSanguineo = "A+";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(int numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String toString() {
        return "\nParticipante: " + numero +
                ", \nNombre: '" + nombre + '\'' +
                ", \nApellido: '" + apellido + '\'' +
                ", \nEdad: " + edad;
    }
}
