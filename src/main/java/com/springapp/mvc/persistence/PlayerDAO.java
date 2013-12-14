package com.springapp.mvc.persistence;

import com.springapp.mvc.model.Player;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by josh on 12/14/13.
 */
public class PlayerDAO {

    SessionFactory sessionFactory;

    public void insertPlayer(Player player){
        sessionFactory.getCurrentSession().save(player);
    }


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Required
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
