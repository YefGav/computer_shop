package dev.yeferson.computer_shop.model;

import dev.yeferson.computer_shop.model.Computador;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ComputadorTest {

    @Test
    @DisplayName("Test if the computer is created")

    void testConstructorYGetters() {

        Computador computador = new Computador(1, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        assertThat(computador.getId(), equalTo(1));
        assertThat(computador.getMarca(), equalTo("Dell"));
        assertThat(computador.getMemoria(), equalTo(16));
        assertThat(computador.getProcesador(), equalTo("Intel i7"));
        assertThat(computador.getSistemaOperativo(), equalTo("Windows 11"));
        assertThat(computador.getPrecio(), equalTo(1200.0));

    }

    @Test
    @DisplayName("Test for the toString method")

    void testToString() {

        Computador computador = new Computador(1, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        String expected = "Computador [id=1, marca=Dell, memoria=16 GB, procesador=Intel i7, sistemaOperativo=Windows 11, precio=1200.0]";
        assertThat(computador.toString(), is(expected));
    }

    @Test
    @DisplayName("Test for setters methods")

    void testSetters() {

        Computador computador = new Computador(1, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        computador.setId(2);
        computador.setMarca("HP");
        computador.setMemoria(8);
        computador.setProcesador("Intel i5");
        computador.setSistemaOperativo("Windows 10");
        computador.setPrecio(800.0);

        assertThat(computador.getId(), equalTo(2));
        assertThat(computador.getMarca(), equalTo("HP"));
        assertThat(computador.getMemoria(), equalTo(8));
        assertThat(computador.getProcesador(), equalTo("Intel i5"));
        assertThat(computador.getSistemaOperativo(), equalTo("Windows 10"));
        assertThat(computador.getPrecio(), equalTo(800.0));
    }

    @Test
    @DisplayName("Test for negative price")

    void testPrecioNegativo(){

        Computador computador = new Computador (1, "Dell", 16, "Intel i7", "Windows 11", -1200.0);
        assertThrows(IllegalArgumentException.class, () -> computador.setPrecio(-100.0));
    }
}
