package ExercicioClassesAbstratas;

/*Criar classe pessoa
Criar sub classes PJ e PF - inserir caracteristicas comuns na classe abstrata (Nome)
Criar caracteristicas especificas para as classes concretas(CPF/CNPJ).
 */


public class Main {
    public static void main(String[] args) {

        Pessoa joao = new PessoaFisica();
        joao.nome = "Joao";
        //joao.setcpf = 123_456_789 ***erro por tentar utilizar uma propriedade da pessoa fisica.

        PessoaJuridica pJuridica1 = new PessoaJuridica();
        pJuridica1.nome = "Comercial LTDA";
        pJuridica1.setCnpj(123_456_789);
        pJuridica1.setEnderecoComercial("rua exemplo n10");
        pJuridica1.setTelefoneComercial(19_123_456);

        PessoaFisica pFisica1 = new PessoaFisica();
        pFisica1.nome = "Jose sa Silva";
        pFisica1.setCpf(789_456_123);
        pFisica1.setEnderecoResidencial("rua pessoa fisica n99");
        pFisica1.setSalario(5000.00);
        pFisica1.setTelefoneResidencial(11_852_963);

    }
}
