package Aula2508;
import java.util.Scanner;
public class exerc3 {
    public static void main(String[] args){
        Scanner nm = new Scanner(System.in);
        System.out.print("Entre com o primeiro número: ");
        int num1 = nm.nextInt();
        System.out.print("Entre com o segundo número: ");
        int num2 = nm.nextInt();
        System.out.println("=============================");
        System.out.println("O maior entre " + num1 + " e " + num2 + " é: " + Math.max(num1, num2));
        System.out.println("O menor entre " + num1 + " e " + num2 + " é: " + Math.min(num1, num2));
        System.out.println("=============================");
    }
}
