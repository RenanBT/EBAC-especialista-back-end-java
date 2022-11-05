package Mod11;

import java.util.List;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private String genero;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && genero.equals(pessoa.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero);
    }

    public Pessoa (String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return  nome + " : " +
                genero ;
    }

}
