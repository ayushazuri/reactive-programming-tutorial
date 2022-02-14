package com.ayush.reactiveprogramming;

import com.ayush.reactiveprogramming.domain.Book;
import com.ayush.reactiveprogramming.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public Flux<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    public Mono<Book> getBookById(@PathVariable("id") long id){
        return bookService.getBookById(id);
    }

    @GetMapping("/")
    public String home(){
        return "Go to /books to get all the books or /books/{id} to get book by ID";
    }
}
