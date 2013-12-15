package com.springapp.mvc.controller;

import com.google.gson.Gson;
import com.springapp.mvc.mapping.TeamRO;
import com.springapp.mvc.persistence.PersonDAO;
import com.springapp.mvc.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.IOUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/")
public class PlayerController {
    @Autowired
    PersonDAO dao; // this is built and autowired
    private Gson gson = new Gson(); // google's json library


	@RequestMapping(method = RequestMethod.GET) // when we come to the URL above, with the method indicated below, call this method of the controller
    @Transactional // this tells the app to start a hibernate session for DB interactions
	public String getPerson(ModelMap model) {

       // Insert a new player into the database
//        Person player = new Person();
//        player.setLastName("dickerson");
//        player.setFirst_name("josh");
//        player.setBirthYear(1980);
//        dao.insertPerson(player);

        // get all of the persons
        List<Person> persons = dao.getPersons();


        String json = gson.toJson(persons.toArray());
        // our model is like a dictionary we do lookups on in our jsp page
		model.addAttribute("json", json);
        // here, json referrs to the json.jsp page being rendered
		return "json";
	}

    @RequestMapping(method = RequestMethod.POST)
    @Transactional
    //modelmap is always passed as the last parameter, an is the map that we fill with our response data
    public String postPerson(@RequestBody String jsonBody, ModelMap model){
        System.out.println(jsonBody);
        // this is mapping our request to a class (RO stands for RequestObject)
        TeamRO teamRO = gson.fromJson(jsonBody, TeamRO.class);
        model.addAttribute("json", "working");

        return "json";
    }
}