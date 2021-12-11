package by.bsuir.yanushkevich.lab01.task12;

import java.util.Comparator;

public class AuthorTitlePriceCmp implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int temp = new AuthorTitleCmp().compare(book1, book2);
        if (temp == 0) {
            temp = Integer.compare(book1.getPrice(), book2.getPrice());
        }
        return temp;
    }
}
