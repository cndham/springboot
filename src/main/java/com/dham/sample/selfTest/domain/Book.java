package com.dham.sample.selfTest.domain;

import java.util.Objects;

public class Book {

    private int id;
    private String bookName;
    private String author;
    private String price;

    public Book(int id, String bookName, String author, String price) {

        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == (book.id) &&
                bookName.equals(book.bookName) &&
                author.equals(book.author) &&
                price.equals(book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, author, price);
    }
}
