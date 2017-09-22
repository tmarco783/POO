package Lab08_09;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario us = new Usuario();
        
        System.out.print("Entre com o nome: ");
        us.setNome(sc.nextLine());
        sc.nextLine();
        System.out.print("Entre com a idade: ");
        us.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.print("Entre com o sexo: ");
        us.setSexo(sc.nextLine());
        
        Produto p1 = new Produto(001);
        Produto p2 = new Produto(002, "Arroz");
        Produto p3 = new Produto(003, "Queijo", 15);
        Produto p4 = new Produto(004, "Bolacha", 57, "Alimento", 2.50f);
        
        p1.inserir("Macarrão", 10, "Massa", 6.79f);
        
        p1.vender(6);
        p1.comprar(8);
        p1.consultar();
        p1.igual(p2);
        
        p2.vender(6);
        p2.comprar(8);
        p2.consultar();
        p2.igual(p2);
        
        p3.vender(6);
        p3.comprar(8);
        p3.consultar();
        p3.igual(p2);
        
        p4.vender(6);
        p4.comprar(8);
        p4.consultar();
        p4.igual(p2);
        
    }
    
}
