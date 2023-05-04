public class ProdutoDuravel extends Produto() {
    private int durabilidade;

    public ProdutoDuravel (){
    }

    public void setDurabilidade(int durabilidade){
        this.durabilidade = durabilidade;
    }

    public int getDurabilidade() {
        return durabilidade;
    }
}