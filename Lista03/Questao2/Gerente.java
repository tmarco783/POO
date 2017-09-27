package Lista03.Questao2;
public class Gerente extends Funcionario{
    private double salarioMensal;
    private double bonificacao;

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal + this.getBonificacao(); 
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    @Override
    public String toString(){
        return "Nome = " + this.getNome() + " | Sobrenome = " + this.getSobrenome() 
                + " | Salário Mensal = " + this.getSalarioMensal() + " | Bonificacao = "
                + this.getBonificacao();
    }
}
