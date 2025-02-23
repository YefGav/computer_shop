package dev.yeferson.computer_shop.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TiendaTest {

    private Tienda tienda;

    @BeforeEach

    void setUp() {
        tienda = new Tienda ("Tech Store", "Yeferson Gaviria", "12345-67890");
    }

    @Test
    @DisplayName ("Test if the store is created")

    void testConstructorYGetters() {

        assertThat(tienda.getNombreTienda(), is("Tech Store"));
        assertThat(tienda.getPropietario(), is("Yeferson Gaviria"));
        assertThat(tienda.getIdentificacionTributaria(), is("12345-67890"));
    }

    @Test
    @DisplayName("Test when the list of computers is empty")

    void testListaComputadoresVacia() {

        assertThat(tienda.ListarComputadores(), empty());
    }

    @Test
    @DisplayName("Test for adding computers to the list")

    void testAgregarComputador() {

        Computador computador = new Computador(1, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        tienda.agregarComputador(computador);
        assertThat(tienda.ListarComputadores(), hasSize(1));
        assertThat(tienda.ListarComputadores(), contains(computador));
    }

    @Test
    @DisplayName("Test for delete computers from the list")

    void testEliminarComputador() {

        Computador computador = new Computador(1, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        tienda.agregarComputador(computador);
        tienda.eliminarComputador(1);
        assertThat(tienda.ListarComputadores(), empty());
    }
}
