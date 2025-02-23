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

        assertThat(tienda.getListaComputadores(), empty());
    }
}
