package Carros;

import java.util.ArrayList;
import java.util.List;

public class ListaCarros <T extends Carro> {

    private List<T> listaDeCarros;

    public ListaCarros(){
        listaDeCarros = new ArrayList<>();
    }

    public void adicionarCarro(T carro){
        listaDeCarros.add(carro);
    }

    public void imprimirLista(){
        for(T carro : listaDeCarros){
            System.out.println(carro.getFabricante()+ " " + carro.getModelo() + " " +
                    carro.getTipo() + " " + carro.getTurbo());
        }
    }
}
