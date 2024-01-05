package BarrayListWithObjects;

import java.lang.reflect.Constructor;
import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    public String getNome() {
        return nome;
    }

    private String nome;

    public int getIdade() {
        return idade;
    }

    private int idade;


    public Aluno(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "[ Aluno: " +this.nome +", idade: " +this.idade +"]";
    }

    /*
    * A funcao compareTo() funciona, por padrao, para comparacao feitas entre Strings. Assim sendo, nao conseguimos comparar objetos do tipo Aluno, por exemplo.
    *
    * Logo, para que consigamos realizar essa comparacao, precisamos sobrescrever a funcao de forma que consigamos comparar algum atributo da classe
    *
    * */

    @Override
    public int compareTo(Aluno al){
        return nome.compareTo(al.nome);
    }

}