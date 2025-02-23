package dev.yeferson.computer_shop.model;

import dev.yeferson.computer_shop.model.Computer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ComputerTest {

    @Test
    @DisplayName("Test if the computer is created")

    void testConstructorYGetters() {

        Computer computer = new Computer(1, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        assertThat(computer.getId(), equalTo(1));
        assertThat(computer.getMarca(), equalTo("Dell"));
        assertThat(computer.getMemoria(), equalTo(16));
        assertThat(computer.getProcesador(), equalTo("Intel i7"));
        assertThat(computer.getSistemaOperativo(), equalTo("Windows 11"));
        assertThat(computer.getPrecio(), equalTo(1200.0));

    }

    @Test
    @DisplayName("Test for the toString method")

    void testToString() {

        Computer computer = new Computer(1, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        String expected = "Computer{id=1, marca='Dell', memoria=16 GB, procesador='Intel i7', sistemaOperativo='Windows 11', precio=1200.0}";
        assertThat(computer.toString(), is(expected));
    }

}
