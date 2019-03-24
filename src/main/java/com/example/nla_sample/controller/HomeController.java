package com.example.nla_sample.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
		
	@RequestMapping({"/", "/home"})
    public String sample(Model model) {
        Map<String, Object> input = new HashMap<String, Object>();
        input.put("title", "NLA Sample Project");
		model.addAllAttributes(input);
        return "welcome";
    }
}
