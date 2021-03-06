package com;

import java.util.*;

public class PhoneBook {
    private SortedSet<Person> people = new TreeSet<>();

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
            if (person.containerPhone(num)) {
                return person;
            }
        }
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof PhoneBook) {
            PhoneBook phoneBook = (PhoneBook) o;
            return people.equals(phoneBook.people);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Адресная книга - " + "Человек" + people;
    }

    @Override
    public int hashCode() {
        return people.hashCode();
    }
}
