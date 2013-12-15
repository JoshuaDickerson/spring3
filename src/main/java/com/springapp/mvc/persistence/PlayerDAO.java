package com.springapp.mvc.persistence;

import com.springapp.mvc.model.Player;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

/**
 * Created by josh on 12/14/13.
 */
public class PlayerDAO {

    SessionFactory sessionFactory;

    public void insertPlayer(Player player){
        sessionFactory.getCurrentSession().save(player);
    }

    public Player getPlayerById(int playerId) {
        return (Player) sessionFactory.getCurrentSession().get(Player.class, playerId);
    }

    public List<Player> getPlayers() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Player.class);
        return criteria.list();
    }


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Required
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
