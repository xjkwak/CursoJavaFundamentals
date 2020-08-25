package com.oracle;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
	    System.out.println("  /|");
        System.out.println(" / |");
        System.out.println("/  |");
        System.out.println("____");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edadNombre = scanner.nextInt();
        System.out.print("Peso: ");
        float peso = scanner.nextFloat();
        System.out.print("Estatura: ");
        double estatura = scanner.nextDouble();

        System.out.println("Bienvenido al curso de Java " + nombre);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edadNombre);
        System.out.println("Peso: " + peso);
        System.out.println("Estatura: " + estatura);

    }
}
