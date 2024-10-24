public class Bicicleta extends Vehiculo {

    public double rodado;

    public Bicicleta(double rodado) {
        this.rodado = rodado;
    }

    @Override
    public double consumoCada100Km() {
        return 1; // Consumo fijo para bicicletas
    }

    @Override
    public double velocidadMaxima() {
        return rodado * 1.2; // Fórmula para la velocidad máxima
    }

    @Override
    public int cantidadDePasajeros() {
        return 1; // Las bicicletas solo pueden llevar un pasajero
    }
}
