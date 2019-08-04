package com.dham.sample.selfTest.controller;

import com.dham.sample.selfTest.domain.Book;
import com.dham.sample.selfTest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping (value = "api/book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/getBook/id", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBookbId (@RequestParam String id){

        return bookService.getBookById(id);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book addBook (@RequestBody @Valid Book book){

        return bookService.addBook(book);
    }


    @RequestMapping(value = "/deleteBook/id", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> deleteBookById (@RequestParam String id){

        return bookService.deleteBookById(id);
    }


    @RequestMapping(value = "/updateBook", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book updateBook (@RequestBody Book book){

        return bookService.updateBook(book);
    }
}
