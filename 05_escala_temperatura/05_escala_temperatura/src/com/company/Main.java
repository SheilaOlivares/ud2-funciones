package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static double convertirTemperatura(double t, char escala) {

        if (escala == 'F') {
            return t * 1.8 + 32;
        } else {
            return t * 273.15;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;

        do {
            System.out.print("=== Temperaturas ===\n" +
                    "1. Convertir a Fahrenheit\n" +
                    "2. Convertir a Kelvin\n" +
                    "3. Salir\n" +
                    "Opción:");
            opcion = Integer.parseInt(br.readLine());

            double temperatura = 0;

            if (opcion !=3) {
                System.out.println("Escribe una temperatura en ºC: ");
                temperatura = Double.parseDouble(br.readLine());
            }

            switch (opcion) {
                case 1:
                    System.out.println("La conversion es: " + convertirTemperatura(temperatura, 'F'));
                    break;
                case 2:
                    System.out.println("La conversion es: " + convertirTemperatura(temperatura, 'K'));
                    break;
                       }

        } while (opcion != 3);
    }
}
