package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double longitud(double r) {
        double longitud = (2 * Math.PI * r);
        return longitud;
    }


    public static double area(double r) {
        double area = (Math.PI * Math.pow(r, 2));
        return area;
    }


    public static double volumen(double r) {
        double volumen = (4 / 3 * Math.PI * Math.pow(r, 3));
        return volumen;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String opcion;

        do {
            System.out.println("=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción:");
            opcion = br.readLine();
            double radio = 0;

            if (opcion.equals("A") || opcion.equals("B") || opcion.equals("C")) {
                System.out.println("Escribe el valor del radio: ");
                radio = Double.parseDouble(br.readLine());
            }

            switch (opcion) {
                case "A":
                    System.out.println("La longitud de la circunferencia es: " + longitud(radio));
                    break;
                case "B":
                    System.out.println("El área del círculo es: " + area(radio));
                    break;
                case "C":
                    System.out.println("El volumen de la esfera es: " + volumen(radio));
                    break;
                case "D":
                    System.out.println("Hasta pronto. ");
                    break;
                default:
                    System.out.println("Opción erronea. ");
                    break;
            }

        } while (!opcion.equals("D"));
    }
}