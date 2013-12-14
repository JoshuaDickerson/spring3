package com.springapp.mvc;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class PlayerController {
    @Autowired
    PlayerDAO dao;

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
		model.addAttribute("message", json);
		return "hello";
	}
}