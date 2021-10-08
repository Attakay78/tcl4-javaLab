package com.company.streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("richard", Gender.MALE),
                new Person("abigail", Gender.FEMALE),
                new Person("grace", Gender.FEMALE),
                new Person("max", Gender.MALE),
                new Person("ben", Gender.MALE),
                new Person("gloria", Gender.FEMALE)
        );

        people.stream()
                .filter(person -> person.gender == Gender.MALE)
                .forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

     enum Gender{
        MALE, FEMALE
    }
}
