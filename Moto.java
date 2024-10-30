public class Moto extends  Vehiculo{

    public double cilindrada;
    public boolean ruta;

    public Moto (double cilindrada, boolean ruta){
        this.cilindrada = cilindrada;
        this.ruta = ruta;
    }

    @Override
    public double consumoCada100Km() {
        return 50 + (cilindrada / 10);
    }

    @Override
    public double velocidadMaxima() {
        return cilindrada/2;
    }

    @Override
    public int cantidadDePasajeros() {
        if (cilindrada <= 75){
            return 1;
        } else {
            return 2;
         }
    }
}