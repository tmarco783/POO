package lab2909;
public class TestaConta {
    public static void main(String[] args) {
        /*Instanciando dois objetos do tipo ContaCorrente e ContaPoupanca*/
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();
        
        /*Instanciando mais dois objetos do tipo ContaCorrente e ContaPoupanca*/
        ContaCorrente cc2 = new ContaCorrente();
        ContaPoupanca cp2 = new ContaPoupanca();
        
        /*Instanciando dois objetos do tipo ContaSalario*/
        ContaSalario cs1 = new ContaSalario();
        ContaSalario cs2 = new ContaSalario();
        
        /*Setando os dados da conta corrente*/
        cc1.setNumero(56987);
        cc1.setDono("Joaquim");
        cc1.setSaldo(2500.00);
        
        /*Setando os dados da conta poupança*/
        cp1.setNumero(58965);
        cp1.setDono("Mariana"); 
        cp1.setSaldo(3685.29);
        
        /*Invocando os métodos 'sacar' e 'depositar' para a conta corrente*/
        cc1.sacar(267.90);
        cc1.depositar(789.35);
        
        /*Incovando os métodos 'sacar' e 'depositar' para a conta poupança*/
        cp1.sacar(267.90);
        cp1.depositar(789.35); 
        
        /*Atualizando o saldo da conta poupança*/
        cp1.atualizaSaldo(12.0);
        
        /*Setando os dados da segunda conta corrente*/
        cc2.setNumero(56987);
        cc2.setDono("Joaquim");
        cc2.setSaldo(2500.00);
        
        /*Setando os dados da segunda conta poupança*/
        cp2.setNumero(58965);
        cp2.setDono("Mariana"); 
        cp2.setSaldo(3685.29);
        
        /*Transferindo R$355.90 da conta corrente 2 para a conta poupança 2*/
        cc2.transferir(cp2, 355.90);
        
        /*Setando os dados da conta salário 1*/
        cs1.setNumero(56987);
        cs1.setDono("Joaquim");
        cs1.setSaldo(2500.00);
        
        /*Setando os dados da conta salário 2*/
        cs2.setNumero(58965);
        cs2.setDono("Mariana"); 
        cs2.setSaldo(3685.29);
        
        /*Invocando os métodos 'sacar' e 'depositar' da conta salário 1*/
        cs1.sacar(267.90); 
        cs1.depositar(789.35); 
        
        /*Invocando os métodos 'sacar' e 'depositar' da conta salário 2*/
        cs2.sacar(267.90);
        cs2.depositar(789.35); 
        
        /*Transferindo R$355.90 da conta 'cs1' para a conta 'cs2'*/
        cs1.transferir(cs2, 355.90);
        
        /*Transferindo R$355.90 da conta 'cs2' para a conta 'cp2'*/
        cs2.transferir(cp2, 355.90);
        
    }
    
}
