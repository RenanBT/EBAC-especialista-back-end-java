package Carros;

public class Carros<T> {

    private T modelo;
    private T fabricante;
    private boolean turbo;

    public void setModelo(T modelo){
        this.modelo = modelo;
    }

    public T getModelo(){
        return modelo;
    }

    public void setFabricante(T fabricante){
        this.fabricante = fabricante;
    }

    public T getFabricante() {
        return fabricante;
    }

    public void setTurbo(boolean b){
        this.turbo = (boolean) turbo;
    }

    public boolean getTurbo(){
        return false;
    }

}
