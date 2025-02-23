package dev.yeferson.computer_shop.Controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.yeferson.computer_shop.model.Computador;
import dev.yeferson.computer_shop.model.Tienda;

public class ControllerTest {

    @Test
    @DisplayName("Test for the creation of the controller")

    void testConstructor() {

        Tienda tienda = new Tienda("Tech Store", "Yeferson Gaviria","12345-67890");
        Controller controller = new Controller(tienda);
        assertThat(controller, is(notNullValue()));
    }

    @Test
    @DisplayName("Test to add a computer to the store")

    void testAgregarComputador() {

        Tienda tienda = new Tienda("Tech Store", "Yeferson Gaviria","12345-67890");
        Controller controller = new Controller(tienda);
        Computador computador = new Computador(1, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        
        controller.agregarComputador(computador);
        List<Computador> listaComputadores = tienda.ListarComputadores();
        assertThat(listaComputadores, hasItem(computador));
    }

    @Test
    @DisplayName("Test to delete a computer to the store")

    void testEliminarComputador() {

        Tienda tienda = new Tienda("Tech Store", "Yeferson Gaviria","12345-67890");
        Controller controller = new Controller(tienda);
        Computador computador = new Computador(1, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        
        controller.agregarComputador(computador);
        controller.eliminarComputador(1);
        List<Computador> listaComputadores = tienda.ListarComputadores();
        assertThat(listaComputadores, not(hasItem(computador)));
    }

    @Test
    @DisplayName("Test to search a computer by brand")

    void testBuscarComputadorPorMarca () {

        Tienda tienda = new Tienda("Tech Store", "Yeferson Gaviria","12345-67890");
        Controller controller = new Controller(tienda);
        Computador computador1 = new Computador(1, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        Computador computador2 = new Computador(2, "HP", 8, "Intel i5", "Windows 10", 800.0);
        Computador computador3 = new Computador(3, "Dell", 16, "Intel i7", "Windows 11", 1200.0);
        
        controller.agregarComputador(computador1);
        controller.agregarComputador(computador2);
        controller.agregarComputador(computador3);
        List<Computador> listaComputadores = controller.buscarComputadorPorMarca("Dell");
        assertThat(listaComputadores, hasSize(2));
        assertThat(listaComputadores, contains(computador1, computador3));
    }
}
