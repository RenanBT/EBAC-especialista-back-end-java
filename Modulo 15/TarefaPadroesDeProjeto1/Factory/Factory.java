package Padroes.TarefaPadroesDeProjeto1.Factory;

public abstract class Factory {

    public Car create(String category){

        Car car = retrieveCar(category);

        return car;
    }


    abstract Car retrieveCar(String category);

}
