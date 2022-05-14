package ru.skypro;

import java.util.Arrays;
import java.util.Objects;


public class Library {

    private Book[] books;
    Book book;
    Author author;
    private int m;


    public Library(int m) {
        this.books = new Book[m];

    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    @Override
    public String toString() {
        String result = null;
        String str = "Library:";
        System.out.println(str);
        StringBuilder one = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            one.append(books[i].toString() + "\n");
            result = one.toString();
            }
        return  result;

        }
    }



