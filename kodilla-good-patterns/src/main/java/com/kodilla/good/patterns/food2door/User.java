package com.kodilla.good.patterns.food2door;

import java.time.LocalDate;

public class User {
    private String name;
    private String surname;
    private LocalDate age;

    public User(String name, String surname, LocalDate age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }
}
