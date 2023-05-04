public class Carro extends Veiculo {
    /*No caso dos carros, ele deseja cadastrar a marca, a placa, a quilometragem, a
    potência do motor, a quantidade de portas e o valor do aluguel. */
    
    private int potencia;
    private int portas;    

    public Carro() {
    }

    public void setPotencia(int p) {
        potencia = p;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPortas(int p) {
        portas = p;
    }

    public int getPortas(){
        return portas;
    }

    public String print() {
        return "CARRO" + '\n' + "Marca: " + this.marca + '\n' + "Placa:" + this.placa + '\n' + "Quilometragem: " + this.quilometragem + "KM" + '\n' + "Valor: R$" + this.valor + '\n' + "Potencia: " + this.potencia + '\n' + "Portas: " + this.portas;
    }
}