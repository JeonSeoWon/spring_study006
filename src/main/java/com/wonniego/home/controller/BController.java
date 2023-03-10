package com.wonniego.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wonniego.home.command.BCommand;
import com.wonniego.home.command.BListCommand;

@Controller
public class BController {
	
	BCommand command = null;
	
	@RequestMapping(value = "/")
	public String index() {
	
		return "index";
	}
	@RequestMapping(value = "/list")
	public String list(Model model ) {
		
		command = new BListCommand();
		command.excute(model);
		
		return "list";
	}
	@RequestMapping(value = "writeForm")
	public String writeForm() {

		return "write_form";
	}	
}
