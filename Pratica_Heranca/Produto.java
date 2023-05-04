public class Produto() {
    protected String nome;
    protected double preco;
    protected String marca;
    protected String descricao;

    public Produto (String nome, double preco, String marca, String descricao){
        nome = nome;
        preco = preco;
        marca = marca;
        descricao = descricao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}