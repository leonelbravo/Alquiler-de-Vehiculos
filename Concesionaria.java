import java.util.ArrayList;
import java.util.List;

public class Concesionaria {

    public ArrayList<Vehiculo> losVehiculos = new ArrayList<>();

    public void agregarVehiculo(Vehiculo v) {
        losVehiculos.add(v);
    }

    public ArrayList<Vehiculo> losQueConsumenMenosCada100Km(double parametro){
        ArrayList<Vehiculo> resultado = new ArrayList<>();
        for ( Vehiculo v : losVehiculos) {
            if ( v.consumoCada100Km() < parametro ) {
                resultado.add(v);
            }
        }
        return resultado;
    }

    public Vehiculo elDeMayorCoeficienteDeEficiencia(){
        Vehiculo mejorVehiculo = null;
        double maxCoeficiente = 0;
        for (Vehiculo v : losVehiculos){
            double coeficiente = (v.cantidadDePasajeros() * v.velocidadMaxima()) / v.consumoCada100Km();
            if (coeficiente > maxCoeficiente){
                maxCoeficiente = coeficiente;
                mejorVehiculo = v;
            }
        }
        return mejorVehiculo;
    }

    public int cantidadTotalDePasajeros(double velocidad){
        int totalPasajeros = 0;
        for (Vehiculo v : losVehiculos){
            if(v.velocidadMaxima() > velocidad){
                totalPasajeros += v.cantidadDePasajeros();
            }
        }
        return totalPasajeros;
    }
    public List<Vehiculo> vehiculosMasAccidentadosEn(int anio){
        List<Vehiculo> listaFiltrada = new ArrayList<Vehiculo>();

        List<Vehiculo> listaResultado = new ArrayList<Vehiculo>();

        //Filtra la lista Vehiculos
        for (Vehiculo v: losVehiculos) {
            if (v.cantAccPorA(anio) > 0) {
                listaFiltrada.add(v);
            }
        }

        //Ingresa los valores filtrados de forma ordenada a la lista resultado
        for (Vehiculo vehiculo: listaFiltrada){
            if (listaResultado.isEmpty()){
                listaResultado.add(vehiculo);
            }
            else{
                int j = listaResultado.size();
                for(int i=0; i < j;i++){
                    if (listaResultado.get(i).cantAccPorA(anio) < vehiculo.cantAccPorA(anio)) {
                        listaResultado.add(i,vehiculo);
                        break;
                    }
                }
                if (j == listaResultado.size()) listaResultado.add(vehiculo);
            }
        }
        return listaResultado;
    }

    public double losDeMasKilometraje(){
        double masKilometraje = 0;
        for (Vehiculo v : losVehiculos){
            if(v.kilometraje > masKilometraje){
                masKilometraje = v.kilometraje;
            }
        }
        return masKilometraje;
    }
}