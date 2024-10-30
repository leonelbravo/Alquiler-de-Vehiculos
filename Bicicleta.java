public class Bicicleta extends Vehiculo{

    public double rodado = 0;

    public Bicicleta (double rodado){
        this.rodado = rodado;
    }

    @Override
    public double consumoCada100Km() {
        return 1;
    }

    @Override
    public double velocidadMaxima() {
        return rodado * 1.2;
    }

    @Override
    public int cantidadDePasajeros() {
        return 1;
    }
}