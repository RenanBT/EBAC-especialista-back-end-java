//Utilizar mesmo projeto do Módulo sobre Streams para criar um teste que garante
// que apenas nomes femininos estejam na lista final.
// Renan-M,Tais-F,Luisa-F,Maria-F,Nelson-M,Aluisio-M,Elza-F,Nelson-M,Rodrigo-M,Luciene-F
package Testes1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public App() {
    }

    public static void main(String[] args) {

        System.out.println("Digite nome e genero separado por -; Digite outro elemento separado por , ");
        Scanner scan = new Scanner(System.in);
        String nomes = scan.next();
        String[] vetorPrincipal = nomes.split(",");

        List<String> lines = Arrays.stream(vetorPrincipal).toList();
        List<String> vetorF = lines.stream()                // converte list para stream
                .filter(line -> line.contains("-F"))
                .collect(Collectors.toList());

        System.out.println("Lista de nomes femininos: ");
        System.out.println(vetorF);

    }

}

