package PrimeiraLista;
import java.util.Scanner;
public class exerc5 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        float areaTer, areaConst, valorTotal;
        
        System.out.print("Entre com a área total do terreno: ");
        areaTer = tr.nextFloat();
        System.out.print("Entre com a área construída do terreno: ");
        areaConst = tr.nextFloat();
        
        valorTotal = (areaConst * 5.00f) + ((areaTer - areaConst) * 3.80f);
        
        System.out.println("Valor total a ser pago: " + valorTotal);
    }
    
}
