package GenericCars;

import javax.swing.*;

public class App {

    private static ICarDAO iCarDAO;

    public static void main(String args[]) {
        iCarDAO = new CarMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para cadastro, 4 para alteração ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do carro separados por vígula, conforme exemplo: Código, Modelo, Fabricante, Turbo (True or False), Motor",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if(isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o Código",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);

                consultar(dados);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consulta, 3 para cadastro, 4 para alteração ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        //Validar se foi passado somente o cpf
        Car car = iCarDAO.consultar(String.valueOf(Long.parseLong(dados)));
        if (car != null) {
            JOptionPane.showMessageDialog(null, "Carro encontrado: " + car.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Carro não encontrado: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        //Tentar validar se todos os campos estão preenchidos.
        //Se não tiver, passr null no construtor onde o valor é nulo
        Car car = new Car(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4]);

        //(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iCarDAO.cadastrar(car);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Carro já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo: ", "Sair",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }
}

