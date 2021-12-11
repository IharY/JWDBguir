package by.bsuir.yanushkevich.lab01.task12;

import java.util.Comparator;

public class AuthorTitleCmp implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int temp = book1.getAuthor().compareTo(book2.getAuthor());
        if (temp == 0) {
            temp = new TitleCmp().compare(book1, book2);
        }
        return temp;
    }
}
