package lab2909;
public class ContaSalario extends Conta{
    
    @Override
    public void sacar(double valor) {
        System.out.println("==============================");
        this.setSaldo(this.getSaldo() - valor - 0.01f);
        System.out.println("Foi sacado o valor de " + valor + " da conta " + this.getNumero());
        System.out.println("Taxa de operação: R$0.01");
        System.out.println("Saldo atual: " + this.getSaldo());
    }
    
    @Override
    public void depositar(double valor) {
        System.out.println("==============================");
        this.setSaldo(this.getSaldo() + valor - 0.01f);
        System.out.println("Foi depositado o valor de " + valor + " na conta " + this.getNumero());
        System.out.println("Taxa de operação: R$0.01");
        System.out.println("Saldo atual: " + this.getSaldo());
    }
}
