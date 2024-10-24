import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    public String patente;
    public double kilometraje;
    public List<Accidente> accidentes = new ArrayList<>();

    public abstract double consumoCada100Km();
    public abstract double velocidadMaxima();
    public abstract int cantidadDePasajeros();

    public void agregarAccidente(Accidente accidente) {
        accidentes.add(accidente);
    }
}
