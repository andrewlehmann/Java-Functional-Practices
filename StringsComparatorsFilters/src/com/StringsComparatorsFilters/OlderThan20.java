package com.StringsComparatorsFilters;

import java.util.ArrayList;
import java.util.List;

import static com.StringsComparatorsFilters.Compare.people;


/**
 * Created by root on 4/12/17.
 */
public class OlderThan20 {
    public static void main(String[] args) {
        List<Person> olderThan20 = new ArrayList<>();
        people.stream()
              .filter(person -> person.getAge() > 20)
              .forEach(person -> olderThan20.add(person));
        System.out.println("olderThan20 = " + olderThan20);


    }

}
