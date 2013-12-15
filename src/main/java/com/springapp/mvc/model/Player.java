package com.springapp.mvc.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

/**
 * Created by josh on 12/14/13.
 */
//@Entity
//@Table(name="player")
public class Player {

    private Person person;

    public Player(Person person){
        this.person = person;
    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="id", nullable = false)
//    private int id;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    Person getPerson(){
//        return  this.person;
//    }
}
