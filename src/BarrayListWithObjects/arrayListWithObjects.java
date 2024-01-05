package BarrayListWithObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class arrayListWithObjects {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Carlos", 21);
        Aluno a2 = new Aluno("Joao", 22);
        Aluno a3 = new Aluno("Marcelo", 25);
        Aluno a4 = new Aluno("Ricardo", 17);
        Aluno a5 = new Aluno("Lucas", 28);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        listaAlunos.add(a4);
        listaAlunos.add(a5);
        Collections.sort(listaAlunos);
        System.out.println(listaAlunos);
        listaAlunos.sort(Comparator.comparing(Aluno::getIdade));
    }
}