import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;


class ConcesionariaTest {
    @Test
    void testLosQueConsumenMenosCada100Km() {
        Concesionaria concesionaria = new Concesionaria();
        Bicicleta bici = new Bicicleta(20);
        Moto moto = new Moto(50, false);
        concesionaria.agregarVehiculo(bici);
        concesionaria.agregarVehiculo(moto);

        List<Vehiculo> result = concesionaria.losQueConsumenMenosCada100Km(2);
        assertTrue(result.contains(bici));
        assertFalse(result.contains(moto));
    }

    @Test
    void testElDeMayorCoeficienteDeEficiencia() {

    }

    @Test
    void testCantidadTotalDePasajeros() {

    }

    @Test
    void testVehiculosMasAccidentadosEn() {
        Concesionaria concesionaria = new Concesionaria();
        Bicicleta bici = new Bicicleta(20);
        bici.agregarAccidente(new Accidente(1, "Caída", 2024));
        bici.agregarAccidente(new Accidente(2, "Colisión", 2024));
        concesionaria.agregarVehiculo(bici);

        List<Vehiculo> result = concesionaria.vehiculosMasAccidentadosEn(2024);
        assertEquals(1, result.size());
        assertEquals(bici, result.get(0));
    }

    @Test
    void testLosDeMasKilometraje() {

    }
}
