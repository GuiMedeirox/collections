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

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.nome);
    }
}