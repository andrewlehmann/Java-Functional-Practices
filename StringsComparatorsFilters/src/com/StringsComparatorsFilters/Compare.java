package com.StringsComparatorsFilters;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;


public class Compare {

    public static void main(String[] args)  {

        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35));
        List<Person> ascendingAge =
                people.stream()
                        .sorted(Person::ageDiff)
                        .collect(toList());
        people.forEach(System.out::println);
    }

}
