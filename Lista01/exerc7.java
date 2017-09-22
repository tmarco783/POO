package PrimeiraLista;
import java.util.Scanner;
public class exerc7 {
    public static void main(String[] args) {
        Scanner el = new Scanner(System.in);
        int vetor[] = new int[9];
        System.out.println("====================");
        for(int i = 0; i < 9; i++){
            System.out.print("Elemento " + (i+1) + " do vetor: ");
            vetor[i] = el.nextInt();
        }
        System.out.println("====================");
        for(int i = 0; i < 9; i++){
            if(vetor[i]%2 != 0){
                System.out.println(vetor[i] + " é ímpar e sua posição no vetor é: " + i);
            }
        }
        System.out.println("====================");
        
    }
    
}
