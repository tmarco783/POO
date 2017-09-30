package lab2909;
public class ContaPoupanca extends Conta{ 
    
    public void atualizaSaldo(double percent) {
        System.out.println("==============================");
        this.setSaldo(this.getSaldo() + (this.getSaldo() * (percent/100.0)));
        System.out.println("Saldo atual: " + this.getSaldo());
    }
    
    
    
}
