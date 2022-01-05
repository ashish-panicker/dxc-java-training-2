package javademos.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        ListDemo ld = new ListDemo();
        // ld.printList();
        ld.find(4);
        ld.find(15);
    }
}

class ListDemo{

    List<Integer> numbers;
    private Iterator<Integer> iterator;

    public ListDemo(){
        numbers = new ArrayList<>(); // or LinkedList<>();
        numbers.add(1); // 0
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(5);
    }

    public void printList(){

        iterator = numbers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Integer i : numbers){
            System.out.println(i);
        }
    }

    public void find(Integer i){
        if(numbers.contains(i)){
            System.out.format("Found %d at location %d %n", i, numbers.indexOf(i));
        }else{
            System.out.format("%d not found %n", i);
        }
    }
}


class SetDemo {

    Set<Integer> numbers;

    public  SetDemo() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(5);
        // numbers.add("6");
    }

    public void printSet() {
        for (Integer i : numbers) {
            System.out.println(i);
        }
    }

}
