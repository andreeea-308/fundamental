package com.sda.exercitii;

public class Masina {
    private String marca;
    private String model;
    private final int anDeFabricatie;
    private int viteza;
    public static int numberOfCars = 0;

    public Masina(String marca, String model, int anDeFabricatie, int viteza) {
        this.marca = marca;
        this.model = model;
        this.anDeFabricatie = anDeFabricatie;
        this.viteza = viteza;
        numberOfCars++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnDeFabricatie() {
        return anDeFabricatie;
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    public int accelerare(int n) {
        return viteza + n;
    }

    public int decelerare(int n) {
        return viteza - n;
    }
}
