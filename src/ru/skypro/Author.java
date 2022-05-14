package ru.skypro;

import java.util.Objects;

class Author {
    String name;
    String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author: " + name + " " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author1 = (Author) other;
        return name.equals(author1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

