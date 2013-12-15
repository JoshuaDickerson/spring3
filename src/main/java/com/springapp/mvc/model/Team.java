package com.springapp.mvc.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by josh on 12/15/13.
 */
public class Team implements Serializable{
    private String name;
    private int sportId;
    private List<Player> players;
}
