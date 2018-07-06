package com.example.movie.user;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class User {

    private long id;

    private String username;

    private String name;

    private Short age;

    private BigDecimal balance;
}
