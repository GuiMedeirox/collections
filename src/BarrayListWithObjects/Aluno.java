package BarrayListWithObjects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int idade;


    public Aluno(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "[ Aluno: " +this.nome +", idade: " +this.idade +"]";
    }

    /*
    * A funcao compareTo() funciona para comparacao entre Strings, assim sendo, nao conseguimos comparar objetos do tipo Aluno, por exemplo.
    *
    * Logo, para que consigamos realizar essa comparacao, precisamos sobrescrever a funcao de forma que consigamos comparar algum atributo da classe
    *
    * */
    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.nome);
    }

}