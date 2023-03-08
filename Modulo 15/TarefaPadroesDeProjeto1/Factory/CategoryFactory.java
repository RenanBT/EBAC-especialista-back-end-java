package Padroes.TarefaPadroesDeProjeto1.Factory;



public class CategoryFactory extends Factory {


    @Override
    Car retrieveCar(String category) {
        if ("minivan".equalsIgnoreCase(category)){
            return new Honda(1.5,"flex","Honda", "Fit");
        } else if ("compact".equalsIgnoreCase(category)) {
            return new Fiat(1.0,"flex","Volkswagen", "Mobi");
        } else if ("pickup".equalsIgnoreCase(category)) {
            return new Chevrolet(1.4,"gasoline","Chevrolet", "Montana");
        } else if ("SUV".equalsIgnoreCase(category)){
            return new VW(1.3,"flex","Volkswagen", "T-Cross");
        }
        return null;
    }
}
