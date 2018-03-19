package com;

import java.util.HashSet;

public class Person implements Comparable<Person> {
    private HashSet<String> phoneList = new HashSet<>();
    private String name;

    public Person(String name, String num) {
        this.checkName(name);
        this.checkNum(num);
        this.name = name;
        this.phoneList.add(num);
    }

    private void checkName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Имя не задано");
    }

    private void checkNum(String num) {
        if (num == null || num.isEmpty())
            throw new IllegalArgumentException("Телефон не задан");

        for (char c : num.toCharArray()) {
            if (!(Character.isDigit(c) || c == '#' || c == '*' || c == '-' || c == '+')) {
                throw new IllegalArgumentException("Недопустимый символ");
            }
        }
    }

    boolean containerPhone(String phone) {
        return phoneList.contains(phone);
    }

    public String getName() {
        return name;
    }

    public String[] getPhones() {
        return phoneList.toArray(new String[0]);
    }

    public void addPhone(String num) {
        checkNum(num);
        phoneList.add(num);
    }

    public boolean removePhone(String num) {
        if (phoneList.size() == 1) {
            throw new IllegalStateException("Последний номер удаляться не должен");
        }
        return phoneList.remove(num);
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
