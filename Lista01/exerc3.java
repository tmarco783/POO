package PrimeiraLista;
import javax.swing.JOptionPane;
public class exerc3 {
    public static void main(String[] args) {
        int a, b, result = 0;
        int operador;
        
        a = (Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro valor inteiro: ")));
        b = (Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo valor inteiro: ")));
        operador = (Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de um operador\npara o cálculo '1=(+)', '2=(-)', '3=(/)', '4=(*)': ")));
        
        switch (operador) {
            case 1:
                result = a+b;
                break;
            case 2:
                result = a-b;
                break;
            case 3:
                result = a/b;
                break;
            case 4:
                result = a*b;
                break;
            default:
                break;
        }
        
        JOptionPane.showMessageDialog(null, "Resultado: " + result);
    }
    
}
