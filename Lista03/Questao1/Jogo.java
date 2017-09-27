package Lista03.Questao1;
public class Jogo extends Item{
    private int numJogadores;
    private String plataforma;

    public int getNumJogadores() {
        return numJogadores;
    }

    public void setNumJogadores(int numJogadores) {
        this.numJogadores = numJogadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    public String mostraDadosComuns(){
        return "Item{" + "titulo=" + titulo + ", ano=" + ano + ", tempoDuracao=" + tempoDuracao + ", comentarios=" + comentarios + '}';
    }

    @Override
    public String toString() {
        return "Jogo{" + "numJogadores=" + numJogadores;
    }
    
    
    
}
