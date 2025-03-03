package com.library.service;

import com.library.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(1101,"atomic reaserch","sir red johnson",1974,320.5));
        list.add(new Book(1102,"action palma","jr. wittekar",1967,112.5));
        list.add(new Book(1103,"structural business","carl mustin",1998,168.7));
        list.add(new Book(1104,"focus","minacle holand",2011,720.2));
        list.add(new Book(1105,"life host","andreaw martin",2006,190.25));
    }

    // creating get method for getting all books
    public List<Book> getAllBooks(){
        return list;
    }

    // creating get method for getting single book by id
    public Book getBookById(int id){
      Book book = list.stream().filter(e->e.getId()==id).findFirst().get();
      return book;
    }

    // adding / creating new book
    public Book addNewBook(Book book){
        list.add(book);
        return book;
    }

    // delete method for deleting the book
    public void deleteBook(int id){
        list = list.stream().filter(e-> e.getId() != id).collect(Collectors.toList());
    }

    // update method for updating existing record
    public void updateBook(Book book, int bookId){
     list = list.stream().map(e->{
         if(e.getId() == bookId){
             e.setTitle(book.getTitle());
             e.setAuthor(book.getAuthor());
             e.setPrice(book.getPrice());
         }
         return e;
     }).collect(Collectors.toList());
    }
}
