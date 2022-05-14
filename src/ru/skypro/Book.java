package ru.skypro;

import java.util.Objects;

public class Book {
    String name;
    int yearPublication;
    Author author;

    public Book(String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author; // нужно ли так делать?
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Book: " + name + " by " + author;

    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book1 = (Book) other;
        return name.equals(book1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
