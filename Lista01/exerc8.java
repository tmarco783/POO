package PrimeiraLista;

import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        int vetor[] = new int[9];
        int mat[][] = new int[3][3];
        int v = 0;
        
        System.out.println("====================");
        for(int i = 0; i < 9; i++){
            System.out.print("Elemento " + (i+1) + " do vetor: ");
            vetor[i] = el.nextInt();
        }
        System.out.println("====================");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                mat[i][j] = vetor[v];
                v++;
            }
        }
        for(int i = 0; i < 9; i++){ //Imprimindo o vetor
            System.out.println("Elemento " + (i+1) + " do vetor: " + vetor[i]);
        }
        System.out.println("====================");
        System.out.println("Matriz: ");
        for(int i = 0; i < 3; i++){
            System.out.print("\n");
            for(int j = 0; j < 3; j++){
                System.out.print(mat[i][j]);
            }
        }
        System.out.println("\n====================");
    }
    
}
