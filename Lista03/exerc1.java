package Aula2508;
import java.util.Scanner;
public class exerc1{
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        String nome1, nome2;
        System.out.print("Entre com o primeiro nome: ");
        nome1 = nm.nextLine();
        System.out.print("Entre com o segundo nome: ");
        nome2 = nm.nextLine();
        System.out.println("=============================");
        System.out.println("Quantidade de letras de " + nome1 + ": " + nome1.length());
        System.out.println("Quantidade de letras de " + nome2 + ": " + nome2.length());
        System.out.println("=============================");
        System.out.println(nome1 + " em maiúsculo: " + nome1.toUpperCase());
        System.out.println(nome2 + " em maiúsculo: " + nome2.toUpperCase());
        System.out.println("=============================");
        if(nome1.equals(nome2)){
            System.out.println("Os nomes são iguais");
        }else{
            System.out.println("Os nomes são diferentes");
        }
        System.out.println("=============================");
    }
    
}
