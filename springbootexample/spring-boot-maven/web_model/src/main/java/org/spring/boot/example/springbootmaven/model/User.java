package org.spring.boot.example.springbootmaven.model;

public class User {

    private final Long id;
    private final String firstName;
    private final String lastName;

    public User(final Long id, final String firstName, final String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
