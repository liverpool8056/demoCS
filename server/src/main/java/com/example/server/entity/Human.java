package com.example.server.entity;

import lombok.Data;

@Data
public class Human {
    private Person person;
    private String nation;

    public Human(Person person, String nation) {
        this.person = person;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Human{" +
                "person=" + person +
                ", nation='" + nation + '\'' +
                '}';
    }
}
