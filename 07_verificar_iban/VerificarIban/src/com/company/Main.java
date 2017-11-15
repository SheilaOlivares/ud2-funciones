package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static boolean esValido(String iban) {

        // Quitar los espacios
        //http://chuwiki.chuidiang.org/index.php?title=Eliminar_espacios_de_un_String_en_Java
       iban = iban.replaceAll("\\s+", "");

        // Extraer los 4 primeros caracteres
        iban = iban.substring(0,4);
        String cuatroPrimeros = iban.substring(0,4);
        String restoCadena = iban.substring(4);

        // Llevarlos al final
        String nuevoIban = restoCadena + cuatroPrimeros;

        // Convertir letras a numeros usando la tabla
        int numero1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                .indexOf(cuatroPrimeros.charAt(0))+10;
        int numero2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                .indexOf(cuatroPrimeros.charAt(1))+10;

        // Montar el String final
        nuevoIban = restoCadena + numero1 + numero2 + cuatroPrimeros.substring(2);

        // Hacer la division (%97) y comprobar ( resto 1,ok)

        long numero = Long.parseLong(nuevoIban);
        System.out.println(nuevoIban);
        return numero % 97 == 1 ;

    }

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        if (esValido("ES98 2038 5778 9830 0076 0236")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
