package dev.yeferson.computer_shop.model;

public class Computer {

    private int id;
    private String marca;
    private int memoria;
    private String procesador;
    private String sistemaOperativo;
    private double precio;

    public Computer(int id, String marca, int memoria, String procesador, String sistemaOperativo, double precio) {
        this.id = id;
        this.marca = marca;
        this.memoria = memoria;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public double getPrecio() {
        return precio;
    }

@Override
public String toString() {
    return "Computador [" +
            "id=" + id +
            ", marca=" + marca + 
            ", memoria=" + memoria + " GB" +
            ", procesador=" + procesador + 
            ", sistemaOperativo=" + sistemaOperativo + 
            ", precio=" + precio +
            "]";
    
    }
}