package Streams_Mod22;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.List.*;

public class CriandoStreams {

    public static void main(String[] args) {

        Stream<String> stream = of("Renan", "Betereli", "Tais", "Feichas").stream();

        Stream<String> set = Set.of("Renan", "Betereli", "Tais", "Feichas").stream();

        Map<String, String> map = Map.of("Renan", "Betereli", "Tais", "Feichas");

        List<Pessoa> lista = new Pessoa().popularPessoas();
    }
}
