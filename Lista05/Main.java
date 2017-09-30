package Lista05;
public class Main {
    public static void main(String[] args) {
        LojaConcreta matriz = new LojaConcreta("10.456.789/0001-56", "Subway Alimentos");
        LojaConcreta filial1 = new LojaConcreta("10.457.789/0001-56", "Subway Filial1");
        LojaConcreta filial2 = new LojaConcreta("10.458.789/0001-56", "Subway Filial2");
        
        /*Setando o identificador de cada loja*/
        matriz.setIdentificador("Loja matriz");
        filial1.setIdentificador("Loja filial1");
        filial2.setIdentificador("Loja filial2"); 
        
        /*Setando o endereço de cada loja*/
        matriz.setEndereco("Rua 1, Quadra 25, Lote 19"); 
        filial1.setEndereco("Rua 3, Quadra 40, Lote 17"); 
        filial2.setEndereco("Rua 29, Quadra 5, Lote 20"); 
        
        
        /*Setando o gerente de cada loja*/
        matriz.setGerente("Fernando");
        filial1.setGerente("Caroline");
        filial2.setGerente("Marina"); 
        
        /*Exibindo os dados de cada loja criada*/
        System.out.println(matriz.toString());
        System.out.println(filial1.toString());
        System.out.println(filial2.toString());
        
        /*Invocando o método 'abrir' para cada empresa*/
        matriz.registra_abertura_dia();
        filial1.registra_abertura_dia();
        filial2.registra_abertura_dia();
        
        /*Exibindo os dados de cada loja após abrí-las*/
        System.out.println(matriz.toString());
        System.out.println(filial1.toString());
        System.out.println(filial2.toString());
        
        /*Invocando o método 'fechar' para cada empresa*/
        matriz.registra_fechamento_dia();
        filial1.registra_fechamento_dia();
        filial2.registra_fechamento_dia();
        
        /*Exibindo os dados de cada loja após fechá-las*/
        System.out.println(matriz.toString());
        System.out.println(filial1.toString());
        System.out.println(filial2.toString());
        
        
        
    }
    
}
