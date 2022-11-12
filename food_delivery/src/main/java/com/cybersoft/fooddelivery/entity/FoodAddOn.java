package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "food_addon")
public class FoodAddOn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private int price;

//    // Khoa ngoai
//    private int idFood;

    @ManyToOne
    @JoinColumn(name = "id_food")
    private Food food;
}
