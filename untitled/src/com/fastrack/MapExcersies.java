package com.fastrack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExcersies {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ana", "Comarniceanu");
        map.put("George", "Barosan");
        System.out.println(map);

        System.out.println(map.get("Ana"));
        map.remove("George");
        System.out.println(map);

        map.put("Mihai", "Eminescu");

        Set<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println(map.values());

    }

}
