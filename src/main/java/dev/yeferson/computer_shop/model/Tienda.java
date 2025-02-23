package dev.yeferson.computer_shop.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tienda implements GestionTienda {

    private String NombreTienda;
    private String Propietario;
    private String IdentificacionTributaria;
    private List<Computador> listaComputadores;

    public Tienda(String nombreTienda, String propietario, String identificacionTributaria) {
        NombreTienda = nombreTienda;
        Propietario = propietario;
        IdentificacionTributaria = identificacionTributaria;
        listaComputadores = new ArrayList<>();
    }
    public String getNombreTienda() {
        return NombreTienda;
    }
    public String getPropietario() {
        return Propietario;
    }
    public String getIdentificacionTributaria() {
        return IdentificacionTributaria;
    }
    

    public List<Computador> ListarComputadores() {
        return new ArrayList<>(listaComputadores);
    }

    public void agregarComputador(Computador computador) {
        listaComputadores.add(computador);
    }

    public void eliminarComputador(int id) {
        listaComputadores.removeIf(computador -> computador.getId() == id);
    }

    public List<Computador> buscarComputadorPorMarca (String marca) {
       
        return listaComputadores.stream()
        .filter(c -> c.getMarca().equalsIgnoreCase(marca))
        .collect(Collectors.toList());
    }

    
}

