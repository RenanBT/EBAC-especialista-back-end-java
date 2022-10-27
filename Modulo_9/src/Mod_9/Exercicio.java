package Mod_9;

import java.util.Scanner;

/**
 * @author RenanBT
 */

public class Exercicio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        Integer num = scan.nextInt();

        System.out.println("Valor digitado: " + num);

        int num2 = Integer.valueOf(num);
        System.out.println("Unboxing: " + num2);

    }
}
