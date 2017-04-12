package com.StringsComparatorsFilters;

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static com.StringsComparatorsFilters.Compare.people;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.toList;


public class OlderThan20 {
    public static void main(String[] args) {
        List<Person> olderThan20 = new ArrayList<>();
        people.stream()
              .filter(person -> person.getAge() > 20)
              .forEach(person -> olderThan20.add(person));
        System.out.println("olderThan20 = " + olderThan20);
        
        //This is the same as
        List<Person> alsoOlderThan20 =
                people.stream()
                      .filter(person -> person.getAge() > 20)
                      .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println("alsoOlderThan20 = " + alsoOlderThan20);
        
        List<Person> olderthan20toList =
                people.stream()
                      .filter(person -> person.getAge() > 20)
                      .collect(toList());
        
        Map<Integer, List<Person>> peopleByAge =
                people.stream()
                      .collect(groupingBy(Person::getAge));
        System.out.println("peopleByAge = " + peopleByAge);
        
        // maps every object with the same
        Map<Integer, List<String>> nameOfPeopleByAge =
                people.stream()
                      .collect(groupingBy(Person::getAge,
                                          Collectors.mapping(Person::getName, toList())));
        
        Comparator<Person> byAge = Comparator.comparing(Person::getAge);
        Map<Character, Optional<Person>> oldestPersonOfEachLetter =
                people.stream()
                      .collect(groupingBy(person -> person.getName().charAt(0),
                                          reducing(BinaryOperator.maxBy(byAge))));
        System.out.println("Oldest person of each letter: ");
        System.out.println(oldestPersonOfEachLetter);
        
        
    }
    
}
