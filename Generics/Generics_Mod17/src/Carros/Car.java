package Carros;

import java.util.Objects;

public abstract class Car<T>  {
    protected String modelo;
    protected String fabricante;
    protected Boolean turbo;
    protected double motor;


    public Car(String modelo, String fabricante, Boolean turbo, double motor){

        this.modelo = modelo;
        this.fabricante = fabricante;
        this.turbo = turbo;
        this.motor = motor;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

}
