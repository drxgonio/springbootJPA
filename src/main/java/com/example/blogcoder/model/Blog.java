package com.example.blogcoder.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="blog")
public class Blog {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;
}
