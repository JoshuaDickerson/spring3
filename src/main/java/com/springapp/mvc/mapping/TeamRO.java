package com.springapp.mvc.mapping;

import com.springapp.mvc.model.Team;
import com.springapp.mvc.model.User;

import java.io.Serializable;

/**
 * Created by josh on 12/15/13.
 */
// this is a request object (RO) which is the thing we use to map the json requests to, before doing the creation on the actual model
public class TeamRO implements GenericRO, Serializable {
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private Team team;
    private User user;
}
