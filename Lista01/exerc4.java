package PrimeiraLista;
import java.text.DecimalFormat;
import java.util.Scanner;
public class exerc4 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float peso, altura, imc;
        
        System.out.print("Entre com o peso (kg) de um pessoa: ");
        peso = ob.nextFloat();
        System.out.print("Entre com a altura (m) de uma pessoa: ");
        altura = ob.nextFloat();
        
        imc = peso /(altura * altura);
        System.out.println("IMC = " + df.format(imc));
    }
    
}
