package ExercicioClassesAbstratas;

public class PessoaFisica extends Pessoa{

    public String getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(String enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(long telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private String enderecoResidencial;

    private long cpf;

    private long telefoneResidencial;

    private double salario;

}
