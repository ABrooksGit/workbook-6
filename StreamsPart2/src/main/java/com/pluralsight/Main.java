package com.pluralsight;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Person> allPeople = new ArrayList<>();
        List<Person> lastNameOfPerson;
        int totalAge;
        allPeople.add(new Person("Jodi",  "Cline",42));
        allPeople.add(new Person("Marsha", "Patrick",25));
        allPeople.add(new Person("Tracie", "Monroe", 55));
        allPeople.add(new Person("Elsie",  "Cline",40));
        allPeople.add(new Person("Sara",   "White", 19));
        allPeople.add(new  Person("Deb",    "Benton", 103));
        allPeople.add(new Person("Todd", "Mckenzie", 24));
        allPeople.add(new Person("Cheryl", "Klein", 80));
        allPeople.add(new Person("Bonnie", "Mcmillan", 56));
        allPeople.add(new Person("Malcolm", "Fitzpatrick", 54));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write last name");
        String lastName = scanner.nextLine().trim();






            lastNameOfPerson = allPeople.stream()
                .filter(person -> person.getLastName().equalsIgnoreCase(lastName))
                    .collect(Collectors.toList());

        System.out.println(lastNameOfPerson);



            totalAge = allPeople.stream()
                    .map(x -> x.getAge())
                    .reduce(0, (temp, i) -> temp += i);


        System.out.println(totalAge);




        int oldestAge = allPeople.stream()
                .map(person -> person.getAge())
                .reduce(0, (oldAge, newAge) -> (oldAge > newAge) ? oldAge : newAge);

        System.out.println(oldestAge);

        int youngestAge = allPeople.stream()
                .map(Person::getAge)
                .min(Integer::compare)
                .orElse(0); // or some other default if the stream is empty

        System.out.println(youngestAge);

        int oldestAgeAgain = allPeople.stream()
                .map(p -> p.getAge())
                        .max(Integer :: compare)
                        .orElse(0);



//            totalAge = allPeople.stream()
//                    .map(Person ::getAge)
//                .reduce(0, (add, person) -> add + person.getAge(), Integer ::sum
//                );




//        System.out.println(totalAge);















    }
}