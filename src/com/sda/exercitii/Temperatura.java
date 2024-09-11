package com.sda.exercitii;

public class Temperatura {
    private int celsius;
    private int fahrenheit;


    public Temperatura(int celsius, int fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }


    public double temperaturaCelsius() {
        double gradeCelsius = (fahrenheit - 32) / 1.8;
        return gradeCelsius;
    }

    public double temperaturaFahrenheit() {
        double gradeFahrenheit = (celsius * 1.8) + 32;
        return gradeFahrenheit;
    }
}
