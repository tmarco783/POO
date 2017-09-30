package Lista05;

public abstract class Loja implements Registro {
    private String identificador;
    private String cnpj;
    private String razaoSocial;
    private boolean aberta;
    
    public Loja(String cnpj, String razaoSocial){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
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
                this.getCnpj() + " | Status: " + status;
    }
    
    @Override
    public void registra_abertura_dia() {
        if(this.getAberta()){
            System.out.println("A empresa já se encontra aberta");
        }else{
            this.setAberta(true);
            System.out.println("A empresa " + this.getIdentificador() + " foi aberta com sucesso!");
            System.out.println("===========================================================================");
        }
    }
    @Override
    public void registra_fechamento_dia() {
        if(!this.getAberta()){
            System.out.println("A empresa já se encontra fechada");
        }else{
            this.setAberta(false);
            System.out.println("A empresa " + this.getIdentificador() + " foi fechada com sucesso");
            System.out.println("===========================================================================");
        }
    }
    
}
