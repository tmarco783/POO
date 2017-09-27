package Lista03.Questao1;
public class Cd extends Item{
    private String artista;
    private int qtdeFaixas;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQtdeFaixas() {
        return qtdeFaixas;
    }

    public void setQtdeFaixas(int qtdeFaixas) {
        this.qtdeFaixas = qtdeFaixas;
    }
    
    public String mostraDadosComuns(){
        return "Item{" + "titulo=" + titulo + ", ano=" + ano + ", tempoDuracao=" + tempoDuracao + ", comentarios=" + comentarios + '}';
    }
    
    @Override
    public String toString() {
        return "Cd{" + "artista=" + artista + ", qtdeFaixas=" + qtdeFaixas + '}';
    }
    
    
    
}
