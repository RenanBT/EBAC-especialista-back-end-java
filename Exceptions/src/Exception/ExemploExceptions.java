package Exception;

import javax.swing.*;

public class ExemploExceptions {
    public static void main(String[] args) {

        String opcao = JOptionPane.showInputDialog(null,"Digite o cod do cliente: ",
                "", JOptionPane.INFORMATION_MESSAGE);

        try{
            ClienteService.consultarCliente(opcao);
        } catch(ClienteNaoEncontradoException e){
            //System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(), "sair",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
