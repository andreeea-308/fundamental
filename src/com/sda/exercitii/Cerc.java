package com.sda.exercitii;

public class Cerc {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public double arieCerc () {
        return Math.PI * Math.pow(raza, 2);
    }

    public double petrimetruCerc () {
        return 2 * Math.PI * raza;
    }
}
