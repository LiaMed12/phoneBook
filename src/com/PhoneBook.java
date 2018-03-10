package com;

import java.util.*;

public class PhoneBook {
    private java.util.SortedSet<Person> people = new TreeSet<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public boolean removePerson(String name) {
        return people.remove(new Person(name, "1"));
    }

    public Person getPerson(String name) {
        SortedSet<Person> ss = people.subSet(new Person(name, "1"), new Person(name + "1", "2"));
        return ss.size() > 0 ? ss.first() : null;
    }

    public Person[] getPersons() {
        return people.toArray(new Person[0]);
    }

    public Person findPersonByNumber(String num) {
        for (Person person : people) {
            if (person.conteinerPhone(num)) {
                return person;
            }
        }
        return null;
    }
}
