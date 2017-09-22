package Aula2508;
import java.util.Scanner;
public class exerc2 {
    public static void main(String[] args){
        Scanner ft = new Scanner(System.in);
        System.out.print("Entre com um valor decimal: ");
        float valor = ft.nextFloat();
        System.out.println("==================================");
        System.out.println("Valor arredondado para cima: " + Math.ceil(valor));
        System.out.println("Valor arredondado para baixo: " + Math.floor(valor));
        System.out.println("Valor arredondado normalmente: " + Math.round(valor));
        System.out.println("==================================");
    }
}
