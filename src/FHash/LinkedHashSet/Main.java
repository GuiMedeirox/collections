package FHash.LinkedHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> l = new LinkedHashSet<>();
        l.add("John Textor");
        l.add("Botafogo");
        l.add("Lilica Ripilica");
        l.add("Poze");
        l.add("MC IG");

        System.out.println(l);
        l.remove("Botafogo");
        System.out.println(l);
    }
}
