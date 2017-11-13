package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void calcularCambio(double valor, String moneda) {

        switch (moneda) {
            case "USD":
                System.out.println("El cambio es : "+valor * 1.16728);
                break;
            case "GBP":
                System.out.println("El cambio es : "+valor * 0.89099);
                break;
            case "CNY":
                System.out.println("El cambio es : "+valor * 7.74997);
                break;
            case "JPY":
                System.out.println("El cambio es : "+valor * 132.221);
                break;
            default:
                System.out.println("Error conversion no valida . ");
                break;
        }


    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un valor : ");
        double valor = Double.parseDouble(br.readLine());
        System.out.print("Moneda a la que convrtir (USD, GBP, CNY, JPY): ");
        String moneda = br.readLine();

        calcularCambio(valor, moneda);


    }
}
