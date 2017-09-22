package Aula2508;

import java.util.Scanner;

public class exerc5 {

    public static void main(String[] args) {
        Scanner vt = new Scanner(System.in);
        int vetor[] = new int[10];
        int soma = 0;
        float media = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Entre com o elemento " + (i + 1) + " do vetor: ");
            vetor[i] = vt.nextInt();
            soma += vetor[i];
        }
        media = (soma / 10);
        System.out.println("===========================");
        System.out.println("Soma dos valores no vetor: " + soma);
        System.out.println("Média do vetor: " + media);
        System.out.println("===========================");
        System.out.println("Vetor em ordem inversa: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println("Elemento " + (i + 1) + " do vetor: " + vetor[i]);
        }
        System.out.println("===========================");
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento " + (i + 1) + " do vetor²: " + (vetor[i] * vetor[i]));
        }
        System.out.println("===========================");

    }
}
