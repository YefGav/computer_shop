package dev.yeferson.computer_shop.model;

import java.util.List;

public class Tienda {

    private String NombreTienda;
    private String Propietario;
    private String IdentificacionTributaria;
    private List<Computador> listaComputadores;
    public Tienda(String nombreTienda, String propietario, String identificacionTributaria) {
        NombreTienda = nombreTienda;
        Propietario = propietario;
        IdentificacionTributaria = identificacionTributaria;
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
    


    
}

