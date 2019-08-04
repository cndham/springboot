package com.dham.sample.selfTest.service;

import com.dham.sample.selfTest.domain.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class BookService {



    public static List<Book> bookList = new ArrayList<>();


    static {

        Book book1 = new Book (1, "c", "strsotrope" , "12.50");
        Book book2 = new Book (2, "c++", "gosling" , "13.50");
        Book book3 = new Book (3, "java", "coffee" , "14.50");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
    }

    public Book getBookById(String id) {

        Book book = bookList.stream().filter(b -> b.getId() == Integer.parseInt(id)).findFirst().orElse(null);
        return book;
    }

    public Book addBook(Book book) {
        
        bookList.add(book);
        return book;
    }

    public List<Book> deleteBookById(String id) {
        bookList.forEach(book -> {
            if (book.getId() == Integer.parseInt(id)) {
                bookList.remove(book);
            }
        });
        return bookList;
    }

    public Book updateBook(Book book) {

        Optional<Book> book1 = bookList.stream().filter(b -> b.getId() == book.getId())
                .findFirst();
        bookList.remove(book1);
        bookList.add(book);
        return book;
    }
}
