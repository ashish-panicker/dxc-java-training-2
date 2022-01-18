package javademos.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        String[] fruits =
                {"Apple", "Orange", "Banana", "Grapes", "Mango", "Pineapple", "Strawberry"};

        Stream<String> fruitStream = null;
        System.out.println("Listing all fruits: "); //iterating through the array
        System.out.println("---------------------------------");
        
        fruitStream = Stream.of(fruits);
        fruitStream.forEach(fruit -> System.out.println(fruit));
        // fruitStream.forEachOrdered(fruit -> System.out.println(fruit));

        // for(String fruit : fruits) {
        //     System.out.println(fruit);
        // }
        System.out.println();

        Predicate<String> notContainApple = x -> !x.toLowerCase().contains("apple");
        Predicate<String> notContainsR = x -> !x.toLowerCase().contains("r");
        System.out.println("Listing all fruits who doesn't have the string apple in them:  ");
        System.out.println("---------------------------------"); //filtering
        fruitStream = Stream.of(fruits);
        fruitStream.filter(notContainApple.and(notContainsR))
                    .forEach(fruit -> System.out.println(fruit));
        // for(String fruit : fruits) {
        //     if(!fruit.toLowerCase().contains("apple")) {
        //         System.out.println(fruit);
        //     }
        // }
        System.out.println();

        Predicate<String> containsApple = x -> x.toLowerCase().contains("apple");
        
        fruitStream = Stream.of(fruits);
        List<String>  listFruits = fruitStream.
                filter(containsApple)
                .collect(Collectors.toList());
                    
        System.out.println("Fruits from the filtered list");
        System.out.println("---------------------------------");

        listFruits.stream().forEach(fruit -> System.out.println(fruit));

        System.out.println();
    }

}


