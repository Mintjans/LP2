public class ProdutoNaoDuravel extends Produto() {
    private Date dataValidade;
    private String genero;

    public ProdutoNaoDuravel (){
    }

    public void setDataValidade(String dataValidade){
        this.dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataValidade);
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

}