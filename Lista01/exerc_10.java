package PrimeiraLista;
import java.util.Scanner;

public class exerc_10 {
    public static void main(String[] args) {
        Scanner tp = new Scanner(System.in);
        int mat[][] = new int[2][2];
        int maior, l = 0, c = 0;
        
        for(int i = 0; i < 2; i++){ //Lendo a matriz
            for(int j = 0; j < 2; j++){
                System.out.print("Elemento ["+i+"]["+j+"] da matriz: ");
                mat[i][j] = tp.nextInt();
            }
        }
        maior = mat[0][0];
        System.out.println("=======================");
        for(int i = 0; i < 2; i++){ //Lendo a matriz
            for(int j = 0; j < 2; j++){
                if(mat[i][j] > maior){
                    maior = mat[i][j];
                    l = i;
                    c = j;
                }
            }
        }
        
        System.out.println("Maior elemento da matriz: " + maior);
        System.out.println("Sua posição é: ["+l+"]["+c+"]");
        
    }
    
}
