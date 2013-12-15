package com.springapp.mvc.model;

import javax.persistence.*;

/**
 * Created by josh on 12/14/13.
 */
@Entity
@Table(name="person")
public class Player {
    // note, you have to make sure your database is set up in mvc-dispatcher-servlet.xml
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name="first_name") // this annotation maps the table column to the object's field
    private String first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="birth_year")
    private int birth_year;
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
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    public int getBirthYear() {
        return birth_year;
    }

    public void setBirthYear(int birthYear) {
        this.birth_year = birthYear;
    }

}
