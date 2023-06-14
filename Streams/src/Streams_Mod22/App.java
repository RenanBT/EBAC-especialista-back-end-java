package Streams_Mod22;

import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

//ler do console {nome - genero} separados por "," ler valores em memoria.
// com lambdas criar outra lista somente com genero feminino e imprimir no console
// .filter();
public class App {
    public static void main(String[] args) {

        VetorPrincipal();
        VetorFeminino();

    }

    public static void VetorPrincipal(){
        int i = 0;

            Scanner scan = new Scanner(System.in);
            System.out.println("Digite nome e genero separado por -; Digite outro elemento separado por , ");
            String nomes = scan.next();
           // String[] vetorPrincipal = nomes.split(",");
        String nomes1 = nomes;
        <String> vetorPrincipal = (nomes);
            for( i = 0; i<vetorPrincipal.length; i++){
                System.out.println(" " + vetorPrincipal[i]);


        }
        vetorPrincipal.stream();

    }

    public static void VetorFeminino(){

        System.out.println("In construction (X_X)");

    }

}
