package FHash.hashMap;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Float> boletim = new HashMap<>();
        boletim.put("POO", 10f);
        boletim.put("BD", 10f);
        boletim.put("TGS", 2.5f);
        boletim.put("TGA", 7.6f);
        boletim.put("FSI", null);
        System.out.println(boletim.containsKey("POO"));
        System.out.println(boletim.containsValue(10f));
        boletim.putIfAbsent("FSI", 5.5f);
    }
}
