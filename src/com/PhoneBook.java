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
}

/*public class phoneBook {
    public class Person {
        public String name;

        Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class ListOfTelephones {
        public HashSet<String> phoneList = new HashSet<>();

        ListOfTelephones(String num) {
            phoneList.add(num);
        }

        public HashSet<String> getlist() {
            return phoneList;
        }
    }

    public class Booklist {
        private Map<Person, ListOfTelephones> book = new HashMap<>();

        public Booklist(Map<Person, ListOfTelephones> myMap) {
            this.book = myMap;
        }

        public void addPersonBook(Person hum, ListOfTelephones num) {
            book.put(hum, num);
        }

        public void deletingpersonBook(Person hum) {
            book.remove(hum);
        }

        public void addnum(Person hum, ListOfTelephones num) {
            if (book.containsKey(hum)) {
                book.get(hum).getlist().add(String.valueOf(num));
            } else throw new IllegalAccessError();
        }

        public void removenum(Person hum, ListOfTelephones num) {
            if (book.containsKey(hum)) {
                book.get(hum).getlist().remove(String.valueOf(num));
            } else throw new IllegalAccessError();
        }

        public ListOfTelephones findOnNumber(Person hum) {
            return book.get(hum);
        }

        public String findOnPeson(Person hum, ListOfTelephones num) {
            String name = null;
            for (Person person : book.keySet()) {
                if (num.equals(person))
                    name = person.toString();
            }
            if (name.equals(null)) {
                throw new IllegalAccessError();
            }
            return name;
        }

        public Map<Person, ListOfTelephones> getPhoneBook() {
            return book;
        }
    }
}*/