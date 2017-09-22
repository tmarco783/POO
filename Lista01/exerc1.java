package PrimeiraLista;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args){
        float valor;
        int codigo;
        valor = (Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor de um produto: ")));
        //JOptionPane.showMessageDialog(null, "Valor: " + valor);
        codigo = (Integer.parseInt(JOptionPane.showInputDialog("Entre com um código de aumento (1-10% | 2-25% | 3-30% | 4-50%): ")));
        
        switch(codigo){
            case 1:
                valor += (valor * 0.10f);
            case 2:
                valor += (valor * 0.25f);
            case 3: 
                valor += (valor * 0.30f);
            case 4:
                valor += (valor * 0.50f);
        }
        
        if(valor >= 1000.0f && valor <= 5000.0f){
            valor += (valor * 0.01f);
        }else if(valor > 5000.0f && valor <= 10000.0f){
            valor += (valor * 0.02f);
        }else if(valor > 10000.0f){
            valor += (valor * 0.03f);
        }
        
        JOptionPane.showMessageDialog(null, "Valor total com imposto: " + valor);
        
        
    }
}
