package com.oracle;

public class EstudianteTester {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Pablito", 20);
        Estudiante e2 = new Estudiante("Pedrito", 23);
        Estudiante e3 = new Estudiante("Anita", 21);

        /*
        System.out.println(e1.nombre);
        System.out.println(e1.edad);

        System.out.println(e2.nombre);
        System.out.println(e2.edad);

        System.out.println(e3.nombre);
        System.out.println(e3.edad);*/

        e1.mostrar();
        e2.mostrar();
        e3.mostrar();
    }
}
