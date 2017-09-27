package Lista03.Questao2;
public class Horistas extends Funcionario{
    private int qtdeHorasTrab;
    private double valorHora;
    
    public int getQtdeHorasTrab(){
        return qtdeHorasTrab;
    }
    
    public void setQtdeHorasTrab(int qtdeHorasTrab){
        this.qtdeHorasTrab = qtdeHorasTrab;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double mostraSalario(){
        double salario;
        salario = this.getQtdeHorasTrab() * this.getValorHora();
        return salario;
    }
    
    
    
    @Override
    public String toString(){
        return  "Nome = " + this.getNome() + " | Sobrenome = " + this.getSobrenome()
                + " | Horas trabalhadas = " + this.getQtdeHorasTrab() + " | Valor da hora = "
                + this.getValorHora()+ " | Salário = " + this.mostraSalario();
    }
    
}
