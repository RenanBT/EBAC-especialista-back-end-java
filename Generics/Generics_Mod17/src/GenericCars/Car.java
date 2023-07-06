package GenericCars;

import java.util.Objects;

public class Car implements Persistent {

    private long codigo;
    private String modelo;
    private String fabricante;
    private Boolean turbo;
    private double motor;


    public Car(long codigo, String modelo, String fabricante, Boolean turbo, double motor){
        this.codigo = codigo;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.turbo = turbo;
        this.motor = motor;
    }

    public Car(String dadosSeparado, String dadosSeparado1, String dadosSeparado2, String dadosSeparado3, String dadosSeparado4) {
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
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



    @Override
    public long getCodigo() {
        return this.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
