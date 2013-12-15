package com.springapp.mvc.controller;

import com.google.gson.Gson;
import com.springapp.mvc.persistence.PlayerDAO;
import com.springapp.mvc.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class PlayerController {
    @Autowired
    PlayerDAO dao; // this is built and autowired

    private Gson gson = new Gson();

	@RequestMapping(method = RequestMethod.GET)
    @Transactional
	public String printWelcome(ModelMap model) {

       // Insert a new player into the database
//        Player player = new Player();
//        player.setLastName("dickerson");
//        player.setFirstName("josh");
//        player.setJersey(33);
//        player.setBirthYear(1980);
//        dao.insertPlayer(player);

        // get all of the players
        List<Player> players = dao.getPlayers();


        String json = gson.toJson(players.toArray());
        // our model is like a dictionary we do lookups on in our jsp page
		model.addAttribute("json", json);
        // here, json referrs to the json.jsp page being rendered
		return "json";
	}
}