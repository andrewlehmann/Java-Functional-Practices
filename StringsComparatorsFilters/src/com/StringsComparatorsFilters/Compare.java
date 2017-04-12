package com.StringsComparatorsFilters;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;


public class Compare {

    private static void printPeople(final String message,
                                    final List<Person> people) {

        System.out.println(message);
        people.forEach(System.out::println);

    }

    public static void main(String[] args) {

        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35)
        );
        List<Person> ascendingAge =
                people.stream()
                      .sorted(Person::ageDiff)
                      .collect(toList());
        people.forEach(System.out::println);

        Comparator<Person> compareAscending = Person::ageDiff;
        Comparator<Person> compareDescending = compareAscending.reversed();
        printPeople("Sorted in ascending order by age: ",
                    people.stream()
                          .sorted(compareAscending)
                          .collect(toList())
        );

        printPeople("Sorted in descending order by age: ",
                    people.stream()
                          .sorted(compareDescending)
                          .collect(toList())
        );
        printPeople("Sorted by name: ",
                    people.stream()
                          .sorted(Comparator.comparing(Person::getName));

        people.stream()
              .min(Person::ageDiff)
              .ifPresent(youngest -> System.out.println("Youngest: " + youngest)
              );

        final Function<Person, Integer> byAge = Person::getAge;
        final Function<Person, String> byName = Person::getName;

        printPeople("Sorted in ascending order by age then name: ",
                    people.stream()
                          .sorted(Comparator.comparing(byAge).thenComparing(byName))
                          .collect(toList())
        );

    }


}
