package Generic;

public class Main {
    public static void main(String[] args) {

        Generic <Integer> g = new Generic<Integer>(100);
        Generic <String> h = new Generic<String>("John Doe");
        Generic <Boolean> i = new Generic<Boolean>(true);
        System.out.println(g.getValor());
        System.out.println(h.getValor());
        System.out.println(i.getValor());
    }
}
