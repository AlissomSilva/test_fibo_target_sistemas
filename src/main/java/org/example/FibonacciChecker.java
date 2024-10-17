package org.example;

import java.util.Scanner;

public class FibonacciChecker {
    public static void calculaFibonacci(int numero) {
        int anterior = 0, proximo = 1;

        System.out.print("Sequência de Fibonacci até " + numero + ": ");
        System.out.print(anterior + " " + proximo);


        while (proximo < numero) {
            int temp = proximo;
            proximo = anterior + proximo;
            anterior = temp;
            System.out.print(" " + proximo);
        }

        System.out.println();
    }

    public static boolean pertenceFibonacci(int numero) {
        int anterior = 0, proximo = 1;

        if (numero == 0 || numero == 1) {
            return true;
        }

        while (proximo <= numero) {
            int temp = proximo;
            proximo = anterior + proximo;
            anterior = temp;
            if (proximo == numero) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número ao usuário
        System.out.print("Informe um número: ");
        int numeroInformado = scanner.nextInt();

        calculaFibonacci(numeroInformado);

        if (pertenceFibonacci(numeroInformado)) {
            System.out.println("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroInformado + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
