package com.amit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, count = 0;
        System.out.print("Escribe un número para comprobar si es primo: ");
        numero = entrada.nextInt();
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.print("El número " + numero + " no es primo");
        } else {
            System.out.print("El número " + numero + " es primo");
        }
    }
}
