package Lista03.Questao1;
public class Filme extends Item{
    private String diretor;
    
    public String getDiretor(){
        return diretor;
    }
    
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    
    public String mostraDadosComuns(){
        return "Item{" + "titulo=" + titulo + ", ano=" + ano + ", tempoDuracao=" + tempoDuracao + ", comentarios=" + comentarios + '}';
    }

    @Override
    public String toString() {
        return "Filme{" + "diretor=" + diretor + '}';
    }
    
    

    
    
    
    
}
