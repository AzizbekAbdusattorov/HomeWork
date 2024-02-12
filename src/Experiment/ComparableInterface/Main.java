package Experiment.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person2 = new Person("B1", 25);
        Person person3 = new Person("C1", 30);
        Person person1 = new Person("A1", 20);

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }

    }
}
