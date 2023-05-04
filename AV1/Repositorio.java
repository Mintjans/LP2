import java.util.ArrayList;
import java.util.Collections;

public class Repositorio {
    private ArrayList<Veiculo> veiculos;

    public Repositorio(){
        veiculos = new ArrayList<Veiculo>();
    }

    public void addProduto(Veiculo produto){
        veiculos.add(produto);
    }

    public void removeProduto(Veiculo produto){
        veiculos.remove(produto);
    }

    public void litaVeic() {
        /*Listar todos os veículos cadastrados e a marca com maior número de carros na LocaLisa */
        System.out.println("Veiculos: \n");
        for(Veiculo veic : veiculos) {
            System.out.println(veic.print());
            System.out.println();   // empty line between items
        }
    }
}