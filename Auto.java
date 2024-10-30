public class Auto extends Vehiculo{

    public int pasajeros;
    public double velMaxima;

    public Auto(double velMaxima, int pasajeros){
        this.velMaxima = velMaxima;
        this.pasajeros = pasajeros;
    }

    @Override
    public double consumoCada100Km() {
        return 20 + pasajeros*10;
    }

    @Override
    public double velocidadMaxima() {
        return velMaxima;
    }

    @Override
    public int cantidadDePasajeros() {
        return pasajeros;
    }
}