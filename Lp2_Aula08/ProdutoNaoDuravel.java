import java.util.Date;

public class ProdutoNaoDuravel extends Produto{
	
	private String genero;
	private Date dataValidade;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Date getDataValidade() {
		return dataValidade;
	}
	
	public void setDataValidade(Date data) {
		this.dataValidade = data;
	}
}
