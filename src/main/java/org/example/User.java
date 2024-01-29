package org.example;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    public User(){}

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
