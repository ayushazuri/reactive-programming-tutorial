package com.ayush.reactiveprogramming.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    private long reviewId;
    private long bookIk;
    private double ratings;
    private String comments;
}
