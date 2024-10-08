package pl.gornik.map3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // mapa: klucz - book, wartość - ilość ksiązek
        Map<Book, Integer> books = new HashMap<>();
        books.put(new Book("Lalka", "Bolesław Prus", 2000, 1), 5);
        books.put(new Book("Zbrodnia i kara", "Fiodor Dostojewski", 1882, 1), 3);
        books.put(new Book("W pustyni i w puszczy", "Adam Mickiewicz", 1877, 2), 13);
        books.put(new Book("Pan Tadeusz", "Adam Mickiewicz", 1666, 1), 2);
        books.put(new Book("Pan Tadeusz", "Adam Mickiewicz", 1759, 1), 3);
        books.put(new Book("Wesele", "Stanisław Wyspiański", 1908, 1), 7);
//
//        Można zrobić też tak:
//        Book book = new Book("Dziady cz. III", "Adam Mickiewicz", 2000, 1);
//        books.put(book, 6);


        for (Map.Entry<Book, Integer> bookEntry : books.entrySet()){
            System.out.println("Książka: " + bookEntry.getKey().getTitle() + ", jest na stanie: " + bookEntry.getValue() + " sztuk");
        }

        Set<Book> keysBook = books.keySet();
        for (Book book1 : keysBook){
            System.out.println("Klucze książek: " + book1);
        }

        Collection<Integer> bookValues = books.values();
        for (int values: bookValues){
            System.out.println("Wartości książek: " + values);
        }



    }
}
