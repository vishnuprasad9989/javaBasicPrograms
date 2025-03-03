package com.library.controller;

import com.library.entity.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private BookService bookService;

   // @RequestMapping(value = "/books", method = RequestMethod.GET)
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return this.bookService.getAllBooks();
    }

    // getting single book
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

    // adding new book
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        this.bookService.addNewBook(book);
        return book;
    }

    // method for deleting books bookById
    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId){
          this.bookService.deleteBook(bookId);
    }

    // update handler method
    @PutMapping("/books/{bookId}")
    public Book updateBook(@RequestBody Book book , @PathVariable("bookId") int bookId){
        this.bookService.updateBook(book, bookId);
        return book;
    }
}
