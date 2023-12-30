package BarrayListWithObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class arrayListWithObjects {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Aluno a1 = new Aluno("Carlos", 13);
        Aluno a2 = new Aluno("Wanderson", 15);
        Aluno a3 = new Aluno("Eduardo", 17);
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);

        System.out.println("Ordenando por ordem alfabetica: ");
        Collections.sort(listaAlunos);
        System.out.println(listaAlunos);
        System.out.println("-----=====-----=====");
        System.out.println("Ordenando por idade: ");
        listaAlunos.sort(Comparator.comparing(Aluno::getIdade));
        System.out.println(listaAlunos);

    }
}
