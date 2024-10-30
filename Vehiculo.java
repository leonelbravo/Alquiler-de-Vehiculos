import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    public String patente;
    public double kilometraje;
    List<Accidente> historial = new ArrayList<Accidente>();

    public abstract double consumoCada100Km();
    public abstract double velocidadMaxima();
    public abstract int cantidadDePasajeros();

    //Patente
    public String getPatente(){
        return patente;
    }

    //Accidente
    public List<Accidente> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Accidente> historial) {
        this.historial = historial;
    }

    public void agregarAccidente(Accidente accidente) {
        historial.add(accidente);
    }

    public int cantAccPorA(int anio){
        int resultado = 0;
        for (Accidente a : historial){
            if (a.fecha == anio){
                resultado +=1;
            }
        }
        return resultado;
    }

}