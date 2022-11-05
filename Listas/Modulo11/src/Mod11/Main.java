package Mod11;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {



        exemploListaSimples();
        exemploOrdemCrescente();


    }

    private static void exemploListaSimples(){
        System.out.println("***** Exemplo Lista Simples *****");
        List<String> lista = new ArrayList<>();
        lista.add("Renan Betereli");
        lista.add("Tais Feichas");
        lista.add("Maria Antonieta");
        System.out.println(lista);
        System.out.println("");

    }

    private static void exemploOrdemCrescente(){
        System.out.println("***** Exemplo Lista Simples Ordem Crescente *****");

        List<String> lista = new ArrayList<>();
        lista.add("Renan Betereli");
        lista.add("Tais Feichas");
        lista.add("Maria Antonieta");

    }
}
