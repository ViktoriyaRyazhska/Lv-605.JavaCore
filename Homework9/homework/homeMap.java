package Lesson9;

import java.util.*;
import java.util.function.BiConsumer;

public class homeMap {

    //     Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
    //Output the entities of the map on the screen.
    //There are at less two persons with the same firstName among these 10 people?
    //Remove from the map person whose firstName is ”Orest” (or other). Print result.
    public static void main(String[] args) {
        Map<String, String> valueMap = new HashMap<>();
        HashSet<String> valueHashSet = new HashSet<>();
        Map<String, String> personMap = new HashMap<>();


        {
            personMap.put("Pupkin", "Orest");
            personMap.put("Pivtorykobyly", "Vasya");
            personMap.put("Pumpkin", "Stepan");
            personMap.put("Ivanov", "Oleg");
            personMap.put("Petrova", "Ira");
            personMap.put( "Pumpkins","Jack");
            personMap.put( "Supkin","Nadya");
            personMap.put( "Perkin","Inna");
            personMap.put( "Popkin","Ivan");
            personMap.put( "Papkin","Olga");

// виводимо ключ і значення(я погано розумію що мається на увазі "entities")
           for (Map.Entry entry : personMap.entrySet()) {
               System.out.println("Key: " + entry.getKey() + " Value: "
                       + entry.getValue());
            }
            System.out.println("https://www.youtube.com/watch?v=E6xZach9aiA");
            String valueToBeRemoved = "Orest";
            Iterator iterator = personMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                if (valueToBeRemoved.equals(entry.getValue())) {
                    iterator.remove();
                }
            }
        }
            for (Map.Entry entry : personMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + " Value: "
                        + entry.getValue());
            }

        System.out.println(personMap.size());
        valueHashSet.addAll(personMap.values());
        System.out.println(valueHashSet.size());
        if (personMap.size()==valueHashSet.size()) {
            System.out.println("Glory! Glory!haleluya!!");

        }
        }
        }



