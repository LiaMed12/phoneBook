package com;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class phoneBookTest {
    // private static Map<phoneBook.Person, phoneBook.ListOfTelephones> book = new HashMap<>();

    //private static phoneBook.Booklist createPhoneBook() {
    //   return new phoneBook.Booklist(book);
    // }

    @Test
    public void createPerson() {
        String s = null;
        try {
            Person p = new Person("", "");
        } catch (IllegalArgumentException ex) {
            s = ex.getMessage();
        }
        assertEquals("Имя не задано", s);
    }

    @Test
    public void createPerson2() {
        String s = null;
        try {
            Person p = new Person("ertyu", "");
        } catch (IllegalArgumentException ex) {
            s = ex.getMessage();
        }
        assertEquals("Телефон не задан", s);
    }

    @Test
    public void createPerson3() {
        String s = null;
        try {
            Person p = new Person("ertyu", "hk456788767");
        } catch (IllegalArgumentException ex) {
            s = ex.getMessage();
        }
        assertEquals("Недопустимый символ", s);
    }

    @Test
    public void createPerson4() {
        String s = null;
        try {
            Person p = new Person("", "3224527");
        } catch (IllegalArgumentException ex) {
            s = ex.getMessage();
        }
        assertEquals("Имя не задано", s);
    }


    @Test
    public void SingleNumber() {
        Person p = new Person("Lala", "3425");
        assertEquals(1, p.getPhones().length);
        assertEquals("3425", p.getPhones()[0]);
    }

    @Test
    public void SingleName() {
        Person p = new Person("Lala", "3425");
        assertEquals(4, p.getName().length());
        assertEquals("Lala", p.getName());
    }

    @Test
    public void AddNumber() {
        Person p = new Person("Lala", "3425");
        p.addPhone("+*23456");
        assertEquals(2, p.getPhones().length);
    }

    @Test
    public void AddNumberFalse() {
        String s = null;
        try {
            Person p = new Person("Lala", "3425");
            p.addPhone("+*23j456");
        } catch (IllegalArgumentException ex) {
            s = ex.getMessage();
        }
        assertEquals("Недопустимый символ", s);
    }

    @Test
    public void RemoveNumber() {
        Person p = new Person("Lala", "3425");
        p.addPhone("+*23456");
        p.removePhone("3425");
        assertEquals(1, p.getPhones().length);
        assertEquals("+*23456", p.getPhones()[0]);
    }

    @Test
    public void RemoveNumberFalse() {
        String s = null;
        try {
            Person p = new Person("Lala", "3425");
            p.removePhone("3425");
        } catch (IllegalStateException ex) {
            s = ex.getMessage();
        }
        assertEquals("Последний номер удаляться не должен", s);
    }

    @Test
    public void AddPerson() {
        PhoneBook p = new PhoneBook();
        p.addPerson(new Person("ria", "456784"));
        p.addPerson(new Person("rt", "5690"));
        p.addPerson(new Person("zzxxaa", "456738"));
        p.addPerson(new Person("fghj", "45678"));

        Person[] res = p.getPersons();

        assertEquals("fghj", res[0].getName());
        assertEquals("ria", res[1].getName());
        assertEquals("rt", res[2].getName());
        assertEquals("zzxxaa", res[3].getName());
    }

    @Test
    public void removePersonByName() {
        PhoneBook p = new PhoneBook();
        p.addPerson(new Person("ria", "456784"));
        p.addPerson(new Person("rt", "5690"));
        p.addPerson(new Person("zzxxaa", "456738"));
        p.addPerson(new Person("fghj", "45678"));
        p.removePerson("rt");

        assertEquals(null, p.getPerson("rt"));
    }

    @Test
    public void addPersonBook() {
        //phoneBook.Booklist creatlist = createPhoneBook();
        //creatlist.addPersonBook(new phoneBook.Person("Арсен"),new phoneBook.ListOfTelephones("67389239003"));
        //assertEquals(1, creatlist.getPhoneBook().size());
    }
}