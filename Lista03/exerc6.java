package Aula2508;
import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args){
        Scanner tm = new Scanner(System.in);
        int tam, num, existe = 0;
        System.out.print("Entre com o tamanho do vetor: ");
        tam = tm.nextInt();
        int vetor[] = new int[tam];
        System.out.println("========================");
        System.out.println("Preencha o vetor");
        
        for(int i = 0; i < tam; i++){
            System.out.print("Elemento " + (i+1) + " do vetor: ");
            vetor[i] = tm.nextInt();
        }
        System.out.println("========================");
        System.out.println("=Vetor em ordem crescente=");
        for(int i = 0; i < tam; i++){
            System.out.println("Elemento " + (i+1) + " do vetor: " + vetor[i]);
        }
        System.out.println("========================");
        System.out.println("=Vetor em ordem decrescente=");
        for(int i = (tam-1); i >= 0; i--){
            System.out.println("Elemento " + (i+1) + " do vetor: " + vetor[i]);
        }
        System.out.println("========================");
        System.out.print("Entre com um valor para verificar se existe no vetor: ");
        num = tm.nextInt();
        
        for(int i = 0; i < tam; i++){
            if(num == vetor[i]){
                existe++;
            }
        }
        
        if(existe >= 1){
            System.out.println("O valor digitado existe no vetor!");
        }else{
            System.out.println("O valor digitado não existe no vetor!");
        }
        System.out.println("========================");
        
    }
}
