package pl.gornik.map3;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private int numberOfVolumin; // liczba tomów

    public Book(String title, String author, int yearOfPublication, int numberOfVolumin) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.numberOfVolumin = numberOfVolumin;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", numberOfVolumin=" + numberOfVolumin +
                '}';
    }

    public String getTitle() {
        return title;
    }

    // tworzymy equals i hashcode aby nie było 2 ksiazek z tymi samymi tytułami
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfVolumin == book.numberOfVolumin && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, numberOfVolumin);
    }
}
