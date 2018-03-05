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
    public void createPerson()
    {
        String s = null;
        try
        {
            Person p = new Person("", "");
        }
        catch (IllegalArgumentException ex)
        {
            s = ex.getMessage();
        }
        assertEquals("Имя не задано", s);
    }
    @Test
    public void createPerson2()
    {
        String s = null;
        try
        {
            Person p = new Person("ertyu", "");
        }
        catch (IllegalArgumentException ex)
        {
            s = ex.getMessage();
        }
        assertEquals("Телефон не задан", s);
    }

    @Test
    public void SingleNumber()
    {
        Person p = new Person("Lala", "3425");
        assertEquals(1, p.getPhones().length);
        assertEquals("3425",p.getPhones()[0]);
    }

    @Test
    public void addPersonBook() {
        //phoneBook.Booklist creatlist = createPhoneBook();
        //creatlist.addPersonBook(new phoneBook.Person("Арсен"),new phoneBook.ListOfTelephones("67389239003"));
        //assertEquals(1, creatlist.getPhoneBook().size());
    }
}