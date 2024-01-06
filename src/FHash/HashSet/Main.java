package FHash.HashSet;

import java.util.HashSet;

public class Main {
    static class Pessoa{
        String nome;
        int idade;
        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return nome +" " +idade +" |";
        }
    }

    public static void main(String[] args) {
        HashSet<Pessoa> p = new HashSet<Pessoa>();
        Pessoa p1 = new Pessoa("J Doe1",10);
        Pessoa p2 = new Pessoa("J Doe2",10);
        Pessoa p3 = new Pessoa("J Doe3",10);
        Pessoa p4 = new Pessoa("J Doe4",10);
        Pessoa p5 = new Pessoa("J Doe5",10);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        System.out.println(p);
    }
}