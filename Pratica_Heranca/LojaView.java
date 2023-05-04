
public class LojaView {

	public static void main(String[] args) {
		
		// Objeto Deposito
		Deposito estoque = new Deposito();

        System.out.println(estoque.quantidade());
        System.out.println(estoque.vazio());
		
		ProdutoDuravel livro = new ProdutoDuravel();
        livro.setNome("O estrangeiro");
        livro.setPreco(59.90);
        livro.setMarca("editora");
        livro.setDescricao("um livro");
        livro.setDurabilidade(20);

        ProdutoDuravel celular = new ProdutoDuravel();

        celular.setNome("iphone");
        celular.setPreco(8000);
        celular.setMarca("apple");
        celular.setDescricao("um celular");
        celular.setDurabilidade(5);

        ProdutoDuravel carro = new ProdutoDuravel();

        carro.setNome("gol");
        carro.setPreco(54700);
        carro.setMarca("volkswagem");
        carro.setDescricao("um carro");
        carro.setDurabilidade(20);

		ProdutoNaoDuravel chocolate = new ProdutoNaoDuravel();

        chocolate.setNome("tortuguita");
        chocolate.setPreco(4.75);
        chocolate.setMarca("nsei");
        chocolate.setDescricao("um chocolate");
        chocolate.setGenero("comida");
        chocolate.setDataValidade("31/12/2023");

        ProdutoNaoDuravel toalha = new ProdutoNaoDuravel();

        toalha.setNome("toalha");
        toalha.setPreco(25);
        toalha.setMarca("secura");
        toalha.setDescricao("um toalha");
        toalha.setGenero("higiene");
        toalha.setDataValidade("31/12/2025");

        ProdutoNaoDuravel sabonete = new ProdutoNaoDuravel();

        sabonete.setNome("sabonete");
        sabonete.setPreco(14.50);
        sabonete.setMarca("cheiroso");
        sabonete.setDescricao("um sabonete");
        sabonete.setGenero("higiene");
        sabonete.setDataValidade("31/12/2028");

        estoque.addProduto(livro);
        estoque.addProduto(celular);
        estoque.addProduto(carro);
        estoque.addProduto(chocolate);
        estoque.addProduto(toalha);
        estoque.addProduto(sabonete);

        System.out.println(estoque.quantidade());
        System.out.println(estoque.vazio());

        estoque.removeProduto(celular);

        System.out.println(estoque.maiorPreco());

	}

}
