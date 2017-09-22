package Lab08_09;

public class Produto {
    private int codSeq;
    private String nome;
    private int quantidade;
    private String tipo;
    private float valor;

    // Métodos construtores
    public Produto(int codSeq) {
        this.codSeq = codSeq;
    }

    public Produto(int codSeq, String nome) {
        this.codSeq = codSeq;
        this.nome = nome;
    }

    public Produto(int codSeq, String nome, int quantidade) {
        this.codSeq = codSeq;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(int codSeq, String nome, int quantidade, String tipo, float valor) {
        this.codSeq = codSeq;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    
    //Métodos getters e setters
    public int getCodSeq() {
        return codSeq;
    }

    public void setCodSeq(int codSeq) {
        this.codSeq = codSeq;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    //Métodos especiais
    
    public void vender(int quant){
        if(this.getQuantidade() >= quant){
            this.setQuantidade(this.getQuantidade()-quant);
            System.out.println("Valor total da venda: " + this.getValor()*this.getQuantidade());
        }else{
            System.out.println("Estoque insuficiente!");
        }
    }
    
    public void comprar(int quant, float novoValor){
        this.setQuantidade(this.getQuantidade()+quant);
        this.setValor(novoValor);
        System.out.println("Compra realizada com sucesso!");
    }
    
    public void comprar(int quant){
        this.setQuantidade(quant);
        System.out.println("Compra realizada com sucesso!!");
    }
    
    public void consultar(){
        System.out.println("Código: " + this.getCodSeq());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Quantidade em estoque: " + this.getQuantidade());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Valor: " + this.getValor());
    }
    
    public void inserir(String nome, int quant, String tipo, float valor){
        this.setNome(nome);
        this.setQuantidade(quant);
        this.setTipo(tipo);
        this.setValor(valor);
        System.out.println("Dados do produto atualizados com sucesso!");
    }
    
    public void igual(Produto p){
        if(this.getNome().equals(p.getNome()) && this.getTipo().equals(p.getTipo())){
            System.out.println("O nome e tipo informado são iguais ao do objeto em questão!");
        }else{
            System.out.println("Os dados informados não são iguais!");
        }
    }
    
    
}
