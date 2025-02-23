package dev.yeferson.computer_shop.Interface;

import static org.hamcrest.Matchers.instanceOf;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.yeferson.computer_shop.model.Tienda;

public interface GestionTienda {

    @Test
    @DisplayName(" Test if Tienda implement Interface")

    void testTiendaInterfaz() {
        Tienda tienda = new Tienda("Tech Store", "Yeferson Gaviria", "12345-67890");
        assertThat(tienda, instanceOf(GestionTienda.class));
    }
}
