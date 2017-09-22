package PrimeiraLista;
import javax.swing.JOptionPane;

public class exerc2 {
    public static void main(String[] args) {
        int horasTrab, numDep;
        float salHora, salBruto, salLiq, descINSS = 0, descIR;
        horasTrab = (Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas trabalhadas: ")));
        salHora = (Float.parseFloat(JOptionPane.showInputDialog("Valor do salário/hora: ")));
        numDep = (Integer.parseInt(JOptionPane.showInputDialog("Número de dependentes: ")));
        
        salBruto = ((horasTrab * salHora) + (50.0f * numDep));
        
        if(salBruto <= 1000.0f){
            descINSS = (salBruto * (8.5f/100));
        }else if(salBruto > 1000.0f){
            descINSS = (salBruto * (9/100));
        }
        
        if(salBruto <= 500.0f){
            descIR = 0;
        }else if(salBruto > 500.0f && salBruto <= 1000.0f){
            descIR = (salBruto * (5/100));
        }else{
            descIR = (salBruto * (7/100));
        }
        
        salLiq = (salBruto - descINSS - descIR);
        
        JOptionPane.showMessageDialog(null, "Salário bruto: " + salBruto + 
                                          "\nDesconto INSS: " + descINSS + 
                                          "\nDesconto IR: " + descIR + 
                                          "\nSalário líquido: " + salLiq);
        

    }
    
}
