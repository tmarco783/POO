package Lista05;
public class LojaConcreta extends Loja{
    private String endereco;
    private String gerente;
    
    public LojaConcreta(String cnpj, String razaoSocial) {
        super(cnpj, razaoSocial);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    
    
    @Override
    public String toString(){
        String status;
        
        if(this.getAberta()){
            status = "aberta";
        }else{
            status = "fechada";
        }
        
        return "Razão Social: " + this.getRazaoSocial() + " | CNPJ: " + 
                this.getCnpj() + " | Status: " + status + "\n" + 
                "Endereço: " + this.getEndereco() + " | Gerente: "
                + this.getGerente() + "\n"
                + "===========================================================================";
        
    }
    
    
}
