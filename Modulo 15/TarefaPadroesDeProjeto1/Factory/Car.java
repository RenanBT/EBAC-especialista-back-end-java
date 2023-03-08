package Padroes.TarefaPadroesDeProjeto1.Factory;

public abstract class Car {
    private double engineSize;
    private String fuelSource;
    private String factory;

    public String model;

    public Car(double engineSize, String fuelSource, String factory, String model) {
        this.engineSize = engineSize;
        this.fuelSource = fuelSource;
        this.factory = factory;
        this.model = model;

    }

    public void displayName(){
        System.out.println(getClass().getSimpleName()+ " - " + model );
    }



}

