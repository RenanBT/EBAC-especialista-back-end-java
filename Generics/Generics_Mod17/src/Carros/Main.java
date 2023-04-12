package Carros;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T> void main(String[] args) {

        Carros<String> carro1 = new Carros<String>();
        carro1.setFabricante("Honda");
        String fabricante1 = carro1.getFabricante();
        carro1.setModelo("Fit");
        String modelo1 = carro1.getModelo();
        carro1.setTurbo(false);
        boolean turbo1 = carro1.getTurbo();
        System.out.println(fabricante1 + " " + modelo1 + " Has turbo? " + turbo1);


        Carros<String> carro2 = new Carros<String>();
        carro2.setModelo("T-Cross");




    }
}