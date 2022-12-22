package ExercicioClassesAbstratas;

public class PessoaJuridica extends Pessoa {

    public String getEnderecoComercial() {
        return enderecoComercial;
    }

    public void setEnderecoComercial(String enderecoComercial) {
        this.enderecoComercial = enderecoComercial;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public long getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(long telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    private String enderecoComercial;

    private long cnpj;

    private long telefoneComercial;

    private double faturamento;

}
