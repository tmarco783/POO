package PrimeiraLista;

import java.text.DecimalFormat;

public class exerc6 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        float vetor[] = new float[50];
        vetor[0] = 100.00f;
        vetor[49] = 100.00f;
        
        for(int i = 1; i < 49; i++){
            vetor[i] = (float) Math.pow((i-1), 2) + (float) Math.sqrt(i+1);
        }
        System.out.println("======================");
        for(int i = 0; i < 50; i++){
            System.out.println("Elemento "+i+" do vetor: " + vetor[i]);
        }
        
    }
    
}
