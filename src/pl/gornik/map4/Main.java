package pl.gornik.map4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // mapa: klucz - book, wartość - ilość ksiązek
        Map<Book, Integer> books = new TreeMap<>(new ComparatorByAuthorThenByTitleThenByVolumin());
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
            System.out.println(bookEntry);
        }

        System.out.println("------------------------------------");

        Map<Book, Integer> booksToMap = new HashMap<>();
        putBookToMap(booksToMap, new  Book("Lalka", "Bolesław Prus", 2000, 1), 5);
        putBookToMap(booksToMap, new Book("Zbrodnia i kara", "Fiodor Dostojewski", 1882, 1), 3);
        putBookToMap(booksToMap, new Book("W pustyni i w puszczy", "Adam Mickiewicz", 1877, 2), 13);
        putBookToMap(booksToMap, new Book("Pan Tadeusz", "Adam Mickiewicz", 1666, 1), 2);
        putBookToMap(booksToMap, new Book("Pan Tadeusz", "Adam Mickiewicz", 1759, 1), 3);
        putBookToMap(booksToMap, new Book("Wesele", "Stanisław Wyspiański", 1908, 1), 7);

        for (Map.Entry<Book, Integer> bookEntry2 : booksToMap.entrySet()){
            System.out.println(bookEntry2 + ". Wartość: " + bookEntry2.getValue());

        }
    }
    // obiekty z tym samym tytulem dodają swoje wartości i powstaje 1 ksiazka z tymi wartosciami z 2 ksiazek
    public static void putBookToMap(Map<Book, Integer> books, Book book, int amount){
        if (books.containsKey(book)){
            books.put(book, books.get(book) + amount);
        }else{
            books.put(book, amount);
        }
    }
}
