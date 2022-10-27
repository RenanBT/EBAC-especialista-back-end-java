package Modulo_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double media = 0;
        Scanner nota = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {

            System.out.println("Digite nota numero " + i);
            double notaDigitada = nota.nextDouble();
            if (notaDigitada >= 0 && notaDigitada <=10)
            media = media + notaDigitada;

            else {
                System.out.println("Nota Invalida. Favor digitar numero entre 0 e 10");
                i--;
            }

            if (i == 4){
                double mediaFinal = media / 4;
                System.out.println("Media final: " + mediaFinal);

                    if (mediaFinal >= 7){
                        System.out.println("Aluno Aprovado, Parabens! =D");

                    } else if (mediaFinal >=5) {
                        System.out.println("Aluno em Recuperacao, =0" );

                    }else {
                        System.out.println("Aluno reprovado, nos vemos no ano que vem (X.X)");
                    }
            }
        }
    }
}
