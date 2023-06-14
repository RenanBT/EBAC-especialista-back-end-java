package Exception;

import java.util.Scanner;

public class ClienteService {
    public static void consultarCliente(String cod) throws ClienteNaoEncontradoException {
        // buscar no banco
        boolean isCadastrado = false;

        if (!isCadastrado){
            throw new ClienteNaoEncontradoException("Cliente nao foi encontrado");
        }
    }
}
