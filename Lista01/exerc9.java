package PrimeiraLista;
import java.util.Scanner;
public class exerc9 {
    public static void main(String[] args) {
        Scanner ot = new Scanner(System.in);
        int mat1[][] = new int[2][2];
        int mat2[][] = new int[2][2];
        int matSoma[][] = new int[2][2];
        
        for(int i = 0; i < 2; i++){ //Lendo matriz 1
            for(int j = 0; j < 2; j++){
                System.out.print("Elemento ["+i+"]["+j+"] da matriz 1: ");
                mat1[i][j] = ot.nextInt();
            }
        }
        
        System.out.println("=====================");
        for(int i = 0; i < 2; i++){ //Lendo matriz 2
            for(int j = 0; j < 2; j++){
                System.out.print("Elemento ["+i+"]["+j+"] da matriz 2: ");
                mat2[i][j] = ot.nextInt();
            }
        }
        System.out.println("=====================");
        for(int i = 0; i < 2; i++){ //Somando as matrizes
            for(int j = 0; j < 2; j++){
                matSoma[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.print("Matriz soma:");
        for(int i = 0; i < 2; i++){//Imprimindo a matriz
            System.out.print("\n");
            for(int j = 0; j < 2; j++){
                System.out.print(" "+matSoma[i][j]);
            }
        }
        System.out.println("\n======================");
        
    }
    
}
