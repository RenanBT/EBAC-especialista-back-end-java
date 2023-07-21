package Carros;

public abstract class Carro {

    public Carro(String fabricante, String modelo, String tipo, Boolean turbo){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipo = tipo;
        this.turbo = turbo;
    }

    private String fabricante;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }

    private String modelo;
    private String tipo;
    private Boolean turbo;
}
