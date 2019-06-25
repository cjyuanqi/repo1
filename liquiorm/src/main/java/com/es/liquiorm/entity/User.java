package com.es.liquiorm.entity;

import lombok.Data;

/**
 * Created by:chenjun
 * 2019-06-25 11:22
 */
@Data
public class User {

    private String id;

    private String username;

    private String password;

    public User() {
    }

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
