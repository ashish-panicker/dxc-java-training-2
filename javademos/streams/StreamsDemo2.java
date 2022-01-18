package javademos.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo2 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 17));
        people.add(new Person("Jane", 20));
        people.add(new Person("Jack", 17));
        people.add(new Person("Jill", 22));
        people.add(new Person("Joe", 16));
        people.add(new Person("Jenny", 11));

        // people.stream().forEach(p -> System.out.println(p));

        Predicate<Person> isAdult = p -> p.getAge() >= 18;
        Predicate<Person> isTeenager = p -> p.getAge() >= 13 && p.getAge() < 18;
        Predicate<Person> isChild = p -> p.getAge() < 13;

        System.out.println("\nAdults:");
        people.stream().filter(isAdult).forEach(p -> System.out.println(p));

        System.out.println("\nTeenagers:");
        people.stream().filter(isTeenager).forEach(p -> System.out.println(p));

        System.out.println("\nChildren:");
        people.stream().filter(isChild).forEach(p -> System.out.println(p));

        System.out.println("\nChildren and Teenagers:");
        people.stream().filter(isChild.or(isTeenager)).forEach(p -> System.out.println(p));

        System.out.println("\nAdults and Children:");
        people.stream().filter(isAdult.or(isChild)).forEach(p -> System.out.println(p));
        
        System.out.println("\nAvenrage age of a person in the group: ");
        double averageAge = people.stream().mapToDouble(p -> p.getAge()).average().getAsDouble();
        System.out.format("%2.2f%n", averageAge);
    }

}


class Person {

    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
