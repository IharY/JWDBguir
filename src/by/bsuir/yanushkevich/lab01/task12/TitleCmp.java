package by.bsuir.yanushkevich.lab01.task12;
import java.util.Comparator;

public class TitleCmp implements Comparator<Book> {

        @Override
        public int compare(Book b1, Book b2) {
            return b1.getTitle().compareTo(b2.getTitle());
        }
}

