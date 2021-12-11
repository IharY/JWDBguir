package by.bsuir.yanushkevich.lab01.task12;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(){

    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }
    public static int getEdition() {
        return edition;
    }
    public int getIsbn() {
        return this.isbn;
    }
    @Override
    public int hashCode(){
        return (title + author + price).hashCode();
    }
    @Override
    public boolean equals(Object obj){

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Book book = (Book) obj;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && (price == book.price);
    }
    @Override
    public String toString() {
        return "Book {title = " + getTitle() + ", author = " + getAuthor() + ", price = " + getPrice() + " isbn = " + isbn + "}";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Book)super.clone();
    }
    //@Override
    public int compareTo(Book obj) {
        return this.isbn - obj.isbn;
    }

}
