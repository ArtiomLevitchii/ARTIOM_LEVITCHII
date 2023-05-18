package org.example.homework_nr_10;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<String> thingsToDo = new ArrayList<>();

        thingsToDo.add(0,"Eat");
        thingsToDo.add(1,"Climb");
        thingsToDo.add(2,"Repeat");
        thingsToDo.add(3,"Climb");

        printList(thingsToDo);
        System.out.println("----------------------------");

        thingsToDo.stream()
                .forEach(e-> System.out.println(e));
        System.out.println("----------------------------");
        printUniqueElementsFromList(thingsToDo);

        //------3-------
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("Forearm","Предплечье");
        dictionary.put("Arm","Рука");
        dictionary.put("Finger","Палец");
        dictionary.put("Head","Голова");
        dictionary.put("Shoulder","Плечо");
        dictionary.put("Wrist","Кисть");
        dictionary.put("Neck","Шея");
        dictionary.put("Knee","Колено");
        dictionary.put("Chest","Грудь");
        dictionary.put("Back","Спина");

        System.out.println(dictionary);

        //-------4--------

       Deque<String> lifo = new ArrayDeque<>();
       lifo.offer("BMW");
       lifo.offer("Audi");
        lifo.offer("Mercedes");
        lifo.offer("Mini");
        lifo.offer("Toyota");
        lifo.offer("Kia");

        System.out.println(lifo.removeLast());
        System.out.println(lifo.removeLast());
        System.out.println(lifo.removeLast());

        System.out.println(lifo.getLast());

        //---------------------------------
        System.out.println("---------------------------");
        List<String> carList = new ArrayList<>();
        carList.add("Kia");
        carList.add("Mini");
        carList.add("Subaru");
        carList.add("Bmw");
        carList.add("Volvo");
        carList.add("Honda");
        carList.add("Suzuki");

        System.out.println(carList);
        carList.removeIf(e->e.startsWith("K"));
        System.out.println(carList);
        carList.replaceAll(e->{
            if(e.contains("ru")){
                return "Replaced String";
            }
            return e;
        });
        System.out.println(carList);

    }
    public static void printList(List<String> inputlist){
        for (String element :
                inputlist) {
            System.out.println(element);
        }
    }

    /*public static void printUniqueElementsFromList(List<String> inputlist){
        Set<String> uniqueList = new HashSet<>();
        for (int i = 0; i < inputlist.size(); i++) {
            uniqueList.add(inputlist.get(i));
        }
        System.out.println(uniqueList);
    }*/
    public static void printUniqueElementsFromList(List<String> inputlist){
        Set<String> uniqueList = new HashSet<>(inputlist);
        System.out.println(uniqueList);
    }

}
