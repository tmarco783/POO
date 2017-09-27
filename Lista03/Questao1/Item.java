package Lista03.Questao1;
public class Item {
    protected String titulo;
    protected int ano;
    protected String tempoDuracao;
    protected String comentarios;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(String tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Item{" + "titulo=" + titulo + ", ano=" + ano + ", tempoDuracao=" + tempoDuracao + ", comentarios=" + comentarios + '}';
    }

    
    
    
    
    
}
