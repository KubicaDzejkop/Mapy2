package pl.gornik.map1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> shoppingList = new HashMap<>();
        shoppingList.put("mleko", 3);
        shoppingList.put("cukier", 10);
        shoppingList.put("bułki", 2);
        shoppingList.put("makaron", 6);
        shoppingList.put("woda", 12);

        Set<String> keys = shoppingList.keySet();
        System.out.println("Zestaw kluczy: " + keys);

        Collection<Integer> values = shoppingList.values();
        System.out.println("Zestaw wartości mapy: " + values);

        List<Integer> lists = new ArrayList<>();
        for (String key : keys){
            lists.add(shoppingList.get(key));

        }
        System.out.println("Lista wartości: " + lists);

        for (Map.Entry<String, Integer> entry : shoppingList.entrySet()){
            System.out.println("Klucz: " + entry.getKey() + ", wartość: " + entry.getValue());
        }
    }

}