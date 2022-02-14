package com.ayush.reactiveprogramming.service;

import com.ayush.reactiveprogramming.domain.BookInfo;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class BookInfoService {
    public Flux<BookInfo> getBooks(){
        List<BookInfo> books= List.of(
                new BookInfo(1, "Book one", "Author One", "12331313"),
                new BookInfo(2, "Book two", "Author two", "13123123"),
                new BookInfo(3, "Book three", "Author three", "12331213")
        );

        return Flux.fromIterable(books);
    }

    public Mono<BookInfo> getBookById(long bookId){
        BookInfo book = new BookInfo(bookId, "Book one", "Author One", "12331313");

        return Mono.just(book);
    }
}
