package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double calcularCambiov2(double valor, String moneda) {

        double r = 0;

        switch (moneda) {
            case "USD":
                r = valor * 1.16728;
                break;
            case "GBP":
                r = valor * 0.89099;
                break;
            case "CNY":
                r = valor * 7.74997;
                break;
            case "JPY":
                r = valor * 132.221;
                break;
        }
        return r;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un valor : ");
        double valor = Double.parseDouble(br.readLine());
        System.out.print("Moneda a la que convrtir (USD, GBP, CNY, JPY): ");
        String moneda = br.readLine();

        System.out.println("El cambio es : "+calcularCambiov2(valor,moneda));


    }
}
