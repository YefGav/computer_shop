package dev.yeferson.computer_shop.Controller;

import dev.yeferson.computer_shop.model.Tienda;
import dev.yeferson.computer_shop.model.Computador;

public class Controller {

    private Tienda tienda;

    public Controller(Tienda tienda) {
        this.tienda = tienda;
    }

    public void agregarComputador (Computador computador) {
        tienda.agregarComputador(computador);
    }

    public void eliminarComputador (int id) {
        tienda.eliminarComputador(id);
    }
    
}
