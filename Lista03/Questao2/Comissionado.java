package Lista03.Questao2;
public class Comissionado extends Funcionario{
    private double salarioMensal;
    private int totalVendas;
    private double percentComissao;

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal + (this.getTotalVendas()* (this.getPercentComissao()/100));
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getPercentComissao() {
        return percentComissao;
    }

    public void setPercentComissao(double percentComissao) {
        this.percentComissao = percentComissao;
    }
    
    @Override
    public String toString(){
        return "Nome = " + this.getNome() + " | Sobrenome = " + this.getSobrenome() 
                + " | Salário Mensal = " + this.getSalarioMensal() + " | Total de Vendas = "
                + this.getTotalVendas() + " | Percentual de Comissão = " + this.getPercentComissao();
    }
}
