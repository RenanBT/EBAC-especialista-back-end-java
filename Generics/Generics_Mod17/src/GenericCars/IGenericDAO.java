package GenericCars;

import java.util.Collection;

public interface IGenericDAO <T extends Persistent>{

    public Boolean cadastrar(T entity);

    public void excluir(String modelo);

    public void alterar(T entity);

    public T consultar(String modelo);

    public Collection<T> buscarTodos();
}
