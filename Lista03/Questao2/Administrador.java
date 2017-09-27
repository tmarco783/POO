package Lista03.Questao2;
public class Administrador extends Funcionario{
    private double salarioMensal;

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public String toString(){
        return "Nome = " + this.getNome() + " | Sobrenome = " + this.getSobrenome() 
                + " | Salário Mensal = " + this.getSalarioMensal();
    }
}
