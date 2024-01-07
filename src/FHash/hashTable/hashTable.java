package FHash.hashTable;

import java.util.Hashtable;

public class hashTable {
    public static void main(String[] args) {
        Hashtable<String, Float> boletim = new Hashtable<>();
        boletim.put("POO", 10f);
        boletim.put("BD", 10f);
        boletim.put("TGS", 2.5f);
        boletim.put("TGA", 7.6f);
        boletim.put("FSI", 5f);
        boletim.replace("FSI",10f);

        System.out.println(boletim.values());
    }
}
