package Carros;

public class App {

    public static void main(String args[]) {
        ListaCarros<Carros> listaCarros = new ListaCarros<>();

        listaCarros.adicionarCarro(new Carros("Honda","Fit", "Minivan", false));
        listaCarros.adicionarCarro(new Carros("Volkswagen", "T-Cross", "SUV", true));
        listaCarros.adicionarCarro(new Carros("Toyota", "Corolla", "Sedan", false));

        listaCarros.imprimirLista();
    }
}

