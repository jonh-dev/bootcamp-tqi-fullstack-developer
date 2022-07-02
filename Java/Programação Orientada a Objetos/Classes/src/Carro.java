class Carro {

    String cor;
    String modelo;
    int capacidadeDoTanque;

    public Carro(){

    }

    public Carro(String cor, String modelo, int capacidadeDoTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeDoTanque * valorCombustivel;
    }
}
