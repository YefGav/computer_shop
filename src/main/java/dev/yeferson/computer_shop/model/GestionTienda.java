package dev.yeferson.computer_shop.model;

import java.util.List;

public interface GestionTienda {

    void agregarComputador(Computador computador);
    void eliminarComputador(int id);
    List<Computador> buscarComputadorPorMarca(String marca);
    List<Computador> ListarComputadores();

}
