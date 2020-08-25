package com.oracle;

public class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante(String n, int e)
    {
        nombre = n;
        edad = e;
    }

    public void mostrar() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
    }
}
