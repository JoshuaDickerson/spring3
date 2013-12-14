package com.springapp.mvc;

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
public class HelloController {
    @Autowired
    PlayerDAO dao;

	@RequestMapping(method = RequestMethod.GET)
    @Transactional
	public String printWelcome(ModelMap model) {


        Player player = new Player();
        player.setLastName("dickerson");
        dao.insertPlayer(player);

		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}