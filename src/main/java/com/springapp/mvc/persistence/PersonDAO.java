package com.springapp.mvc.persistence;

import com.springapp.mvc.model.Person;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

/**
 * Created by josh on 12/14/13.
 */
public class PersonDAO {

    SessionFactory sessionFactory;

    public void insertPerson(Person person){
        sessionFactory.getCurrentSession().save(person);
    }

    public Person getPersonById(int playerId) {
        return (Person) sessionFactory.getCurrentSession().get(Person.class, playerId);
    }

    public List<Person> getPersons() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Person.class);
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
