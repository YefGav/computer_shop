package dev.yeferson.computer_shop.Controller;

import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ControllerTest {

    @Test
    @DisplayName("Test for the creation of the controller")

    void testConstructor() {

        Tienda tienda = new Tienda("Tech Store", "Yeferson Gaviria","12345-67890");
        Controller controller = new Controller(tienda);
        assertThat(controller, is(notNullValue()));
    }
}
