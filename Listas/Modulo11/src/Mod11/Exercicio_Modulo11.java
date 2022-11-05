package Mod11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Fazer um programa que leia um nome e um gênero. separar as pessoas por grupos (masculino e feminino)
 */

public class Exercicio_Modulo11 {

    private static final String MASCULINO = "M";
    private static final String FEMININO = "F";


    public static void main(String[] args) {

        System.out.println("Gostaria de adicionar nova pessoa? (S ou N) ");

        Scanner scan = new Scanner(System.in);
        String resposta = scan.nextLine();
        List<Pessoa> lista = new ArrayList<Pessoa>();
        List<Pessoa> listaFem = new ArrayList<Pessoa>();
        List<Pessoa> listaMasc = new ArrayList<Pessoa>();


        Pessoa a = null;
        while (resposta.equalsIgnoreCase("S")) {

            System.out.println("Digite o nome: ");
            Scanner pessoa = new Scanner(System.in);
            String nome = pessoa.nextLine();

            Scanner gen = new Scanner(System.in);
            System.out.println("Digite o genero ("+MASCULINO+" ou "+FEMININO+"): ");
            String genero = gen.nextLine();
            genero = genero.toUpperCase();
            if(genero.equals(MASCULINO) || genero.equals(FEMININO)) {
                a = new Pessoa(nome, genero);
                lista.add(a);
            } else {
                System.out.println("Genero invalido. Cadastro Cancelado");
            }
            System.out.println("Gostaria de adicionar nova pessoa? (S ou N) ");

            scan = new Scanner(System.in);
            resposta = scan.nextLine();


        }

        for (Pessoa pessoa: lista){
            if(pessoa.getGenero().equals(MASCULINO)){
                listaMasc.add(pessoa);
            }
            else{
                listaFem.add(pessoa);
            }
        }
        //System.out.println("Lista geral: " + lista);
        System.out.println("Lista Masculino: " + listaMasc);
        System.out.println("Lista Feminino: " + listaFem);
        System.out.println("Fim");
    }

    public static void criandoPessoa(){
        Pessoa a = new Pessoa("a","a");

    }
}
