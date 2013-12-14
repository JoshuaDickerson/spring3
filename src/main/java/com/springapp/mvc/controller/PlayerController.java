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

@Controller
@RequestMapping("/")
public class PlayerController {
    @Autowired
    PlayerDAO dao; // this is built and autowired

	@RequestMapping(method = RequestMethod.GET)
    @Transactional
	public String printWelcome(ModelMap model) {


        Player player = new Player();
        player.setLastName("dickerson");
        player.setFirstName("josh");
        player.setJersey(33);
        player.setBirthYear(1980);
        dao.insertPlayer(player);

        Gson gson = new Gson();
        String json = gson.toJson(player);

		model.addAttribute("json", json);
        // here, json referrs to the json.jsp page being rendered
		return "json";
	}
}