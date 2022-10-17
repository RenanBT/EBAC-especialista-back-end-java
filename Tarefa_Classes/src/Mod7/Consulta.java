package Mod7;

/**
 * @author Renan Betereli
 * @version 1.0
 * @since version 1.0
 * Metodo Main, entrada hardcoded de informações sobre Medico e Paciente
 */
public class Consulta {

    public static void main(String[] args) {

        Medico medico = new Medico();
        medico.setNomeMedico("Dra Maria Antonieta");
        medico.setCrm("123456789");
        medico.setEspecialidade("Cardiologista");
        medico.imprimirMedico();
        //medico.imprimirMedico1();
        Paciente paciente = new Paciente();
        paciente.setNome("Renan Betereli");
        paciente.setEndereço("Rua teste numero 1");
        paciente.setConvenio(true);
        System.out.println("");
        paciente.imprimirPaciente();


    }
}
