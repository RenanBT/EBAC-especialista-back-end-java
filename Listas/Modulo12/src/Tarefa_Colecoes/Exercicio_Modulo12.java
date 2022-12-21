package Tarefa_Colecoes;

import java.util.Scanner;

public class Exercicio_Modulo12 {

      /*
    Parte 1: Ler nomes do console separados por virgula, guardar em variavel fazer ordenação alfabetica
    imprimir no console (SPLIT)
    Parte 2: Ler nome + "-" + genero (M ou F) ler do console, separar por genero e imprimir no console
    separado por genero
     */

    public static void main(String[] args) {

       VetorEmOrdemAlfabetica();
       VetorSeparadoPorGenero();
    }

    public static void VetorEmOrdemAlfabetica(){

        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os nomes separados por virgula: ");
        String nomes = scan.next();
        String[] vetorNomes = nomes.split(",");
        System.out.println("Vetor desordenado: ");

        for(i = 0; i< vetorNomes.length; i++ ){
            System.out.println(" " + vetorNomes[i]);
        }

        String str[] = vetorNomes;
        String temp;
        System.out.println("Em ordem alfabetica: ");

        for (int j = 0; j < str.length; j++) {
            for ( i = j + 1; i < str.length; i++) {
                // Bubble sort.
                if (str[i].compareTo(str[j]) < 0) {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
            System.out.println(str[j]);
        }
    }

    public static void VetorSeparadoPorGenero(){

        int i =0;
        System.out.println("Digite nome e genero separado por -; Digite outro elemento separado por , ");
        Scanner scan = new Scanner(System.in);
        String nomes = scan.next();
        String[] vetorPrincipal = nomes.split(",");
        String[] vetorF = new String[vetorPrincipal.length];
        String[] vetorM = new String[vetorPrincipal.length];
        System.out.println("**** Vetor Principal **** \n" );
        for (i = 0; i< vetorPrincipal.length; i++){
            System.out.println(" " + vetorPrincipal[i]);
            if (vetorPrincipal[i].contains("-F")) {
                vetorF[i] = vetorPrincipal[i];
            } else if (vetorPrincipal[i].contains("-M")) {
                vetorM[i] = vetorPrincipal[i];
            }
        }
        System.out.println("**** Vetor F **** \n");
        for (i=0; i< vetorF.length; i++){
            if (vetorF[i]!=null) {
                System.out.println(vetorF[i]);
            }

        }
        System.out.println("**** Vetor M **** \n");
        for (i=0; i< vetorM.length; i++){
            if (vetorM[i]!=null) {
                System.out.println(vetorM[i]);
            }
        }
    }
    }



