package dev.yeferson.computer_shop.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

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

    @Test
    @DisplayName("Test for search computers by brand")

    void testBuscarComputadorPorMarca() {

        Computador computador1 = new Computador(1, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        Computador computador2 = new Computador(2, "HP", 8, "Intel i5", "Windows 10", 800.0);
        Computador computador3 = new Computador(3, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
       
        tienda.agregarComputador(computador1);
        tienda.agregarComputador(computador2);
        tienda.agregarComputador(computador3);

        List<Computador> resultados = tienda.buscarComputadorPorMarca("Dell");

        assertThat(resultados, hasSize(2));
        assertThat(resultados, containsInAnyOrder(computador1, computador3));

        List <Computador> sinResultados = tienda.buscarComputadorPorMarca("Apple");
        assertThat(sinResultados, is(empty()));
    }
}
