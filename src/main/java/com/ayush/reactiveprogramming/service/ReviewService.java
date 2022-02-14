package com.ayush.reactiveprogramming.service;

import com.ayush.reactiveprogramming.domain.Review;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

@Component
public class ReviewService {
    public Flux<Review> getReviews(long bookId){
        var reviewList = List.of(
                new Review(1, bookId, 9.1, "good"),
                new Review(2, bookId, 9.6, "Awesome")
        );

        return Flux.fromIterable(reviewList);
    }
}
