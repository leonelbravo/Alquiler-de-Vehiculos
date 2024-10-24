public class Moto extends Vehiculo {

    public double cilindrada;
    public boolean habilitadaParaRuta;

    public Moto(double cilindrada, boolean habilitadaParaRuta) {
        this.cilindrada = cilindrada;
        this.habilitadaParaRuta = habilitadaParaRuta;
    }

    @Override
    public double consumoCada100Km() {
        return 50 + (cilindrada / 10);
    }

    @Override
    public double velocidadMaxima() {
        return cilindrada / 2;
    }

    @Override
    public int cantidadDePasajeros() {
        return cilindrada <= 75 ? 1 : 2;
    }
}
