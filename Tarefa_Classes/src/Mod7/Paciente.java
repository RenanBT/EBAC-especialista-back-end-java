package Mod7;
/**
 * @author Renan Betereli
 * @version 1.0
 * @since version 1.0
 * Metodo privado para abstração de caractetisticas do Objeto Paciente
 */
public class Paciente {

    private String nome;
    private String endereço;
    private boolean convenio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public boolean isConvenio() {
        return convenio;
    }

    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }

    /**
     * Metodo que imprime dados formatados de um paciente.
     */
    public void imprimirPaciente(){
        System.out.println("Paciente:");
        System.out.printf("%s\n%s\nConvenio: %s%n",
                this.nome,
                this.endereço,
                this.convenio);
    }

}
