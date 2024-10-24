public class Auto extends Vehiculo {

    public int cantidadDePasajeros;
    public double velocidadMaxima;

    public Auto(int cantidadDePasajeros, double velocidadMaxima) {
        this.cantidadDePasajeros = cantidadDePasajeros;
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public double consumoCada100Km() {
        return 20 + (cantidadDePasajeros * 10);
    }

    @Override
    public double velocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public int cantidadDePasajeros() {
        return cantidadDePasajeros;
    }
}
