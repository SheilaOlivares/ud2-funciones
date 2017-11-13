package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(double t) {

        return t * 1.8 + 32;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe temperatura en ºC: ");
        double temperatura = Double.parseDouble(br.readLine());

        System.out.println("Grados Fahrenheit " + convertirTemperatura(temperatura));
    }

}
