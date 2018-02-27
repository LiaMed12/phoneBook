import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class phoneBook {
    public static class Person {
        public String name;

        Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class ListOfTelephones {
        public ArrayList<String> phoneList = new ArrayList<>();

        ListOfTelephones(String num) {
            String[] container;
            container = new String[]{"-", "+", "#", "*", "\\d"};
            if (num.equals(container))
                phoneList.add(num);
            else throw new IllegalAccessError();
        }

        public ArrayList<String> getlist() {
            return phoneList;
        }
    }

    public static class Booklist {
        private Map<Person, ListOfTelephones> book = new HashMap<>();

        public Booklist(Map<Person, ListOfTelephones> myMap) {
            this.book = myMap;
        }

        public void addpersonBook(Person hum, ListOfTelephones num) {
            book.put(hum, num);
        }

        public void deletingpersonBook(Person hum) {
            book.remove(hum);
        }

        public void addnum(Person hum, ListOfTelephones num) {
            if (book.containsKey(hum)) {
                book.get(hum).getlist().add(String.valueOf(num));
            }
            else throw new IllegalAccessError();
        }

        public void removenum(Person hum, ListOfTelephones num) {
            if (book.containsKey(hum)) {
                book.get(hum).getlist().remove(String.valueOf(num));
            }
            else throw new IllegalAccessError();
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
    }
}
