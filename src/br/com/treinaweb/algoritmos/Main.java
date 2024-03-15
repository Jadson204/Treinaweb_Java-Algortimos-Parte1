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
        // ** Busca linear
//        System.out.println("** BUSCA LINEAR **");
//        System.out.println("Digite o número a ser pesquisado: ");
//        int alvo = scan.nextInt();
//        int posicaoResultado = -1;
//        for (int i = 0; i < numeros.length; i++) {
//            if (numeros[i] == alvo) {
//                posicaoResultado = i;
//                break; // Interrompe a varredura caso o número pesquisado seja encontrado
//            }
//        }
//        if (posicaoResultado < 0) {
//            System.out.println("Elemento não foi encontrado!!!");
//        } else {
//            System.out.println(String.format("O número %d foi encontrado na posição %d", alvo, posicaoResultado));
//        }
        // FIM: Busca linear

        // ** Selection Sort
        for (int i =0; i < numeros.length; i++) {
            int indiceDoMenor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceDoMenor]) {
                    indiceDoMenor = j;
                }
            }
            int temp = numeros[indiceDoMenor];
            numeros[indiceDoMenor] = numeros[i];
            numeros[i] = temp;
        }
        System.out.println("Vetor ordenado: ");
        imprimirArray(numeros);
        // ** Fim Selection Sort

        // ** Busca Binária

        // 1, 3, 4, 6, 7

//        System.out.println("Vetor: ");
//        imprimirArray(numeros);
        scan.close();
    }

    private static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}