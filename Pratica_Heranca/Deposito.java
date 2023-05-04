import java.util.ArrayList;

public class Deposito() {
    private ArrayList<Produto> estoque

    public Deposito(){
        estoque = new ArrayList<Produto>();
    }

    public void addProduto(Produto produto){
        estoque.add(produto);
    }

    public void removeProduto(Produto produto){
        estoque.remove(produto);
    }

    public String quantidade(){
        return "Existem " + estoque.size() + " produtos no estoque\n";
    }

    public String vazio(){
        boolean info = estoque.isEmpty();
        if(info){
            return "O estoque está vazio.\n";
        }
        return "O estoque não está vazio\n";
    }

    public String maiorPreco(){
        double maiorpreco = 0;
        int posicao = null;
        for(Produto produto : estoque) {
            if(produto.getPreco()> maiorpreco){
                maiorpreco = produto.getPreco();
                posicao = estoque.indexOf(produto);
            }
        }

        return "O produto com o maior preço é " + estoque[posicao].getNome();
    }
}