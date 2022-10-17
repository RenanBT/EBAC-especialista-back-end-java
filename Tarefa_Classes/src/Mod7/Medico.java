package Mod7;

/**
 * @author Renan Betereli
 * @version 1.0
 * @since version 1.0
 * Metodo privado para abstração de caractetisticas do Objeto Medico
 */
public class Medico {

    private String nomeMedico;
    private String crm;
    private String especialidade;

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @deprecated
     * @see  "metodo em uso: imprimirMedico()"
     */

    public void imprimirMedico1(){
        System.out.println(this.nomeMedico);
        System.out.println(this.crm);
        System.out.println(this.especialidade);
    }

    /**
     * Metodo que imprime dados formatados de um medico
     * @see <a href="https://github.com/RenanBT/EBAC-especialista-back-end-java">Github</a>
     */
    public void imprimirMedico(){
        System.out.println("Medico(a):");
        System.out.printf("%s\n" + "%s\n" + "%s%n",
                this.nomeMedico,
                this.crm,
                this.especialidade);
    }

}
