package br.com.treinaweb.algoritmos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // |------------------------------
        // |  0  |  1  |  2  |  3  |  4  |
        // |------------------------------
        // |     |     |     |     |     |
        // |------------------------------
        int[] numeros = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            int numero = scan.nextInt();
            numeros[i] = numero;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        scan.close();
    }
}