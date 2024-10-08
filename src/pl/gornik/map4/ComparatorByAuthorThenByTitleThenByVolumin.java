package pl.gornik.map4;

import java.util.Comparator;

public class ComparatorByAuthorThenByTitleThenByVolumin implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int comparisionAuthor = b1.getAuthor().compareTo(b2.getAuthor());
        if (comparisionAuthor != 0){
            return comparisionAuthor;
        }else{
            int comparisionTitle = b1.getTitle().compareTo(b2.getTitle());
            if (comparisionTitle != 0){
                return comparisionTitle;
            }else{
                return b1.getNumberOfVolumin() - b2.getNumberOfVolumin();
            }
        }
    }
}
