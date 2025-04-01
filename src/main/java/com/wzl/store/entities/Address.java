package com.wzl.store.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "addresses")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "zip")
    private String zip;

    @Column(name = "state")
    private String state;

    @ManyToOne
    @JoinColumn(name = "user_id") //foreign key (ownership is where foreign key is)
    // @ToString.Exclude -> will not convert this user to string when lombok toString included
    // Need this so User class can maintain user object
    private User user;
}
