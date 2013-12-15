package com.springapp.mvc.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by josh on 12/14/13.
 */
@Entity
@Table(name="person")
public class Person {
    // note, you have to make sure your database is set up in mvc-dispatcher-servlet.xml
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name="first_name") // this annotation maps the table column to the object's field
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="jersey")
    private int jersey;
    @Column(name="birth_year")
    private int birthYear;
    @Column(name="email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getJersey() {
        return jersey;
    }

    public void setJersey(int jersey) {
        this.jersey = jersey;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

}
