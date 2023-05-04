public class Veiculo {
    protected String marca;
    protected String placa;
    protected int quilometragem;
    protected int valor;

    public Veiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public int getValor() {
        return valor;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public void setPlaca(String p) {
        this.placa = p;
    }

    public void setQuilometragem(int q) {
        quilometragem = q;
    }

    public void setValor(int v) {
        valor = v;
    }

    public String print() {
        return "veiculo";
    }
}