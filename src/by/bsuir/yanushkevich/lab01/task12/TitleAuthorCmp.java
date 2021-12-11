package by.bsuir.yanushkevich.lab01.task12;

import java.util.Comparator;

public class TitleAuthorCmp implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int temp = new TitleCmp().compare(book1, book2);
        if (temp == 0) {
            temp = book1.getAuthor().compareTo(book2.getAuthor());
        }
        return temp;
    }
}