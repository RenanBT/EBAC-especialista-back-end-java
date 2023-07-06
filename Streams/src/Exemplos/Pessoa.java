package Exemplos;

import java.util.List;

public class Pessoa {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private String id;
    private String nome;
    private String nacionalidade;
    private int idade;

    public Pessoa(String id,String nome, String nacionalidade, int idade){
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;

    }
    public Pessoa(){}

    public List popularPessoas(){
        Pessoa pessoa1 = new Pessoa("p1", "Renan Betereli", "italiano", 33);
        Pessoa pessoa2 = new Pessoa("p2", "Tais Feichas", "brasileira", 32);
        Pessoa pessoa3 = new Pessoa("p3","Pedro Domotor", "polones", 31);
        return List.of(pessoa1,pessoa2,pessoa3);
    }

}
