package com.oracle;

public class EjemploDeCadenas {
    public static void main(String[] args) {
        String nombre = "Juan Perez";
                       //0123456789

        String porcion = nombre.substring(5);

        char x = nombre.charAt(5); // P

        System.out.println("Caracter de la pos 5: " + x);
        System.out.println("Tam de la cadena: " + nombre.length());
        System.out.println("La subcadena: " + porcion);


    }
}
