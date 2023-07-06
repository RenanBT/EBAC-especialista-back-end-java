package GenericCars;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarMapDAO extends GenericDAO<Car> implements ICarDAO{



    public CarMapDAO(){
        super();
        }

    @Override
    public Class<Car> getClassType() {
        return Car.class;
    }

    @Override
    public Boolean cadastrar(Car entity) {
        return null;
    }

    @Override
    public void excluir(String modelo) {

    }

    @Override
    public void alterar(Car entity) {

    }

    @Override
    public Car consultar(String modelo) {
        return null;
    }

    @Override
    public Collection<Car> buscarTodos() {
        return null;
    }
}
