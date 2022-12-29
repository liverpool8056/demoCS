package com.example.server.entity;

import lombok.Data;

@Data
public class Person {
    private String name;
    private String msg;

    public Person(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
