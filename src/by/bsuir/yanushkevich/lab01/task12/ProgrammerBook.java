package by.bsuir.yanushkevich.lab01.task12;

import java.util.Objects;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook() {

    }

    @Override
    public int hashCode() {
        return (super.hashCode() + language + level).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        return Objects.equals(language, programmerBook.language) && (level == programmerBook.level);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", language: " + language +
                ", level: " + level;
    }
}
