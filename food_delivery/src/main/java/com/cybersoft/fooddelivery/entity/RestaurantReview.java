package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "restaurant_review")
public class RestaurantReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    // Khoa ngoai
//    private int idRestaurant;

    @ManyToOne
    @JoinColumn(name = "id_restaurant")
    private Restaurant restaurant;

    @Column(name = "content")
    private String content;

    @Column(name = "rate")
    private float rate;
}
