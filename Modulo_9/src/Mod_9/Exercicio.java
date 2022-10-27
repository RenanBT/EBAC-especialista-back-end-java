package Mod_9;

import java.util.Scanner;

/**
 * @author RenanBT
 */

public class Exercicio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int num = scan.nextInt();

        System.out.println("Valor digitado: " + num);

        Integer num2 = Integer.valueOf(num);
        //ou
        Integer num3 = num;
        System.out.println("Wrapper: " + num2);
        System.out.println("Wrapper exemplo 2: " + num3);

    }
}
