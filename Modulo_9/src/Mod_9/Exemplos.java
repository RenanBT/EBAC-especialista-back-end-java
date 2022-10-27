package Mod_9;

public class Exemplos {
    public static void main(String[] args) {
        //CASTING EXPLICITO

        int num1 = 10;
        short num2 = (short) num1;

        //Gerando erro

        long numL = 1111111111111111111l;
        System.out.println(numL);
        int numI = (int) numL;
        System.out.println(numI);

        //CASTING IMPLICITO

        int idade = 32;
        long idadeL = idade;
        System.out.println(idade);
        System.out.println(idadeL);
    }
}
