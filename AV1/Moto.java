public class Moto extends Veiculo {
    /*Para as motos ele deseja cadastrar a marca, a placa, a quilometragem, tipo da partida
    (manual ou elétrica), as cilindradas e o valor do aluguel. */

    private String tipo;
    private int cilindradas;

    public Moto() {
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int c) {
        cilindradas = c;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String print() {
        return "MOTO \nMarca: " + this.marca + '\n' + "Placa:" + this.placa + '\n' + "Quilometragem: " + this.quilometragem + "KM" + '\n' + "Valor: R$" + this.valor + '\n' + "Tipo: " + this.tipo + '\n' + "Cilindradas: " + this.cilindradas;
    }
}