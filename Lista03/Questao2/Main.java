package Lista03.Questao2;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    
    Horistas hr[] = new Horistas[2];
    Administrador adm[] = new Administrador[4];
    Comissionado cm[] = new Comissionado[3];
    Gerente gr = new Gerente();
    
    //Capturando dados dos Horistas
    for(int i = 0; i < 2; i++){
        hr[i] = new Horistas();
        hr[i].setNome(JOptionPane.showInputDialog("Entre com o nome do horista " + (i+1) + ": "));
        hr[i].setSobrenome(JOptionPane.showInputDialog("Entre com o sobrenome do horista " + (i+1) + ": "));
        hr[i].setQtdeHorasTrab(Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de horas trabalhadas: "))); 
        hr[i].setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor da hora: ")));
    }
    
    //Capturando dados dos Administradores
    for(int i = 0; i < 4; i++){
        adm[i] = new Administrador();
        adm[i].setNome(JOptionPane.showInputDialog("Entre com o nome do administrador " + (i+1) + ": "));
        adm[i].setSobrenome(JOptionPane.showInputDialog("Entre com o sobrenome do administrador " + (i+1) + ": "));
        adm[i].setSalarioMensal(Float.parseFloat(JOptionPane.showInputDialog("Entre com o salário mensal do administrador " + (i+1) + ": ")));    
    }
    
    //Capturando dados dos Comissionados
    for(int i = 0; i < 3; i++){
        cm[i] = new Comissionado();
        cm[i].setNome(JOptionPane.showInputDialog("Entre com o nome do comissionado " + (i+1) + ": "));
        cm[i].setSobrenome(JOptionPane.showInputDialog("Entre com o sobrenome do comissionado " + (i+1) + ": "));
        cm[i].setSalarioMensal(Float.parseFloat(JOptionPane.showInputDialog("Entre com o salário mensal: ")));
        cm[i].setTotalVendas(Integer.parseInt(JOptionPane.showInputDialog("Entre com o total de vendas: ")));
        cm[i].setPercentComissao(Float.parseFloat(JOptionPane.showInputDialog("Entre com o percentual de comissão: ")));
    }
    
    //Capturando dados do Gerente
    gr.setNome(JOptionPane.showInputDialog("Entre com o nome do gerente: "));
    gr.setSobrenome(JOptionPane.showInputDialog("Entre com o sobrenome do gerente: "));
    gr.setSalarioMensal(Float.parseFloat(JOptionPane.showInputDialog("Entre com o salário mensal do gerente: ")));
    gr.setBonificacao(Float.parseFloat(JOptionPane.showInputDialog("Entre com o percentual de bonificação: "))); 
    
    //Mostrando dados dos Horistas
    System.out.println("==================================");
    System.out.println("Horistas".toUpperCase());
    for(int i = 0; i < 2; i++){
        System.out.println(hr[i].toString());
    }
    
    //Mostrando dados dos Administradores
    System.out.println("==================================");
    System.out.println("Administradores".toUpperCase());
    for(int i = 0; i < 4; i++){
        System.out.println(adm[i].toString());
    }
    
    //Mostrando dados dos Comissionados
    System.out.println("==================================");
    System.out.println("Comissionados".toUpperCase());
    for(int i = 0; i < 3; i++){
        System.out.println(cm[i].toString());
    }
    
    //Mostrando dados do Gerente
    System.out.println("==================================");
    System.out.println("Gerente".toUpperCase());
    System.out.println(gr.toString());
    
    
    } 
    
}
