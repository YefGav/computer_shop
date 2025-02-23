package dev.yeferson.computer_shop.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerTest {

    @Test
    @DisplayName("Test if the computer is created")

    void testConstructorYGetters() {

        Computer computer = new Computer(1, "Dell", 16, "Intel  i7", "Windows 11", 1200.0);

        assertThat(computer.getId().is(1));
        assertThat(computer.getMarca().is("Dell"));
        assertThat(computer.getMemoria().is(16));
        assertThat(computer.getProcesador().is("Intel i7"));
        assertThat(computer.getSistemaOperativo().is("Windows 11"));
        assertThat(computer.getPrecio().is(1200.0));

    }

}
