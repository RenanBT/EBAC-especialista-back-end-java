package Padroes.TarefaPadroesDeProjeto1.Factory;

public class Purchase {

    private String category;
    public Car car;
    public Purchase (String category){
        this.category = category;
        Factory factory = new CategoryFactory();
        car = factory.retrieveCar(category);

    }

}
