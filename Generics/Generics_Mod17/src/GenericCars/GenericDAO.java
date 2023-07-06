package GenericCars;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistent> implements IGenericDAO<T>{
    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getClassType();

    public GenericDAO() {
        this.map = new HashMap<>();
        Map<Long, T> mapaInterno = this.map.get(getClassType());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getClassType(), mapaInterno);
        }
    }


    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getClassType());
        if (mapaInterno.containsKey(entity.getCodigo())){
            return false;

        }
        mapaInterno.put(entity.getCodigo(), entity);
        return true;
    }

    @Override
    public void excluir(String modelo) {

    }

    @Override
    public void alterar(T entity) {

    }

    @Override
    public T consultar(String modelo) {
        return null;
    }

    @Override
    public Collection<T> buscarTodos() {
        return null;
    }
}
