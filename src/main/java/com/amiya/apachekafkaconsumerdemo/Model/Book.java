package com.amiya.apachekafkaconsumerdemo.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    private String author;
    private String isbn;

    public Book() {}

    public Book(String author, String isbn) {
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                " author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
