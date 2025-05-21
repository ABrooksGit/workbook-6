package com.pluralsight;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Person> person = new ArrayList<>();
        List<Person> lastNameOfPerson = new ArrayList<>();
        person.add(new Person("Jodi", "Cline", 42));
        person.add(new Person("Marsha", "Patrick", 25));
        person.add(new Person("Tracie", "Monroe", 55));
        person.add(new Person("Elsie", "Cline", 40));
        person.add(new Person("Sara", "White", 19));
        person.add(new Person("Deb", "Benton", 103));
        person.add(new Person("Todd", "Mckenzie", 24));
        person.add(new Person("Cheryl", "Klein", 80));
        person.add(new Person("Bonnie", "Mcmillan", 56));
        person.add(new Person("Malcolm", "Fitzpatrick", 54));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write last name");
        String lastName = scanner.nextLine().trim();


        for (Person p : person) {
            if (p.getLastName().equalsIgnoreCase(lastName)) {
                lastNameOfPerson.add(p);
            }
        }
        System.out.println(lastNameOfPerson);

        int age = 0;
        int minAge = person.getFirst().getAge();
        int maxAge = person.getFirst().getAge();
        for (Person p : person) {
            if (p.getAge() > maxAge)
                maxAge = p.getAge();
            if (p.getAge() < minAge)
                minAge = p.getAge();
            age += p.getAge();
        }
        System.out.println(maxAge);
        System.out.println(minAge);
        System.out.println(age);
    }


        }










