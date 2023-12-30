package AarrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<String> listaAlunos = new ArrayList<>();
        listaAlunos.add("Carlos");
        listaAlunos.add("Lucas");
        listaAlunos.add("Marcos");
        listaAlunos.add("Jorge");
        listaAlunos.add("Wagner");
        System.out.println(listaAlunos);
        System.out.println("----");
        for(String nome : listaAlunos ){
            System.out.println(nome);
        }
        System.out.println("-----");
        listaAlunos.forEach(nomeAluno -> {
            System.out.println(nomeAluno);
        });
        System.out.println("----");
        for(int i = 0; i < listaAlunos.size(); i++){
            System.out.println(listaAlunos.get(i));
        }
        System.out.println("-----");
        Collections.sort(listaAlunos);
        System.out.println(listaAlunos);


    }
}