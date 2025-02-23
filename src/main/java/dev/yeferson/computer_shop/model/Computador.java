package dev.yeferson.computer_shop.model;

public class Computador {

    private int id;
    private String marca;
    private int memoria;
    private String procesador;
    private String sistemaOperativo;
    private double precio;

    public Computador(int id, String marca, int memoria, String procesador, String sistemaOperativo, double precio) {
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

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");

        }
        this.precio = precio;
    }

}