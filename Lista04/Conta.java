package lab2909;
public class Conta {
    private int numero;
    private String dono;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valor) {
        System.out.println("==============================");
        this.setSaldo(this.getSaldo() - valor); 
        System.out.println("Foi sacado o valor de " + valor + " da conta " + this.getNumero());
        System.out.println("Saldo atual: " + this.getSaldo());
    }
    
    public void depositar(double valor) {
        System.out.println("==============================");
        this.setSaldo(this.getSaldo() + valor); 
        System.out.println("Foi depositado o valor de " + valor + " na conta " + this.getNumero());
        System.out.println("Saldo atual: " + this.getSaldo());
    }
    
    public void transferir(Conta conta, double valor) {
        System.out.println("==============================");
        this.sacar(valor); 
        System.out.println("Foram sacados R$" + valor + " da conta " + this.getNumero());
        conta.depositar(valor);
        System.out.println("Foi transferido para a conta " + conta.getNumero() + " o valor de " + valor);
        System.out.println("Saldo atual: " + this.getSaldo());
    }
    
    
}
