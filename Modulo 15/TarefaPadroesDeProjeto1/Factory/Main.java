package Padroes.TarefaPadroesDeProjeto1.Factory;

public class Main {
    public static void main(String[] args) {

        Purchase hf = new Purchase("minivan");
        hf.car.displayName();

        Purchase SUV = new Purchase("SUV");
        SUV.car.displayName();

        Purchase compact = new Purchase("compact");
        compact.car.displayName();

        Purchase pick = new Purchase("pickup");
        pick.car.displayName();
    }





}


