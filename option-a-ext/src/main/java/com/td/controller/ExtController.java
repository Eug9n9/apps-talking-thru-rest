package com.td.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExtController {

    @Value("${experience.application.url}")
    private String experienceUrl;

    @ModelAttribute("experienceUrl")
    public String getExperienceUrl() {
    	return experienceUrl;
    }

    @RequestMapping("/")
    public String welcome() {
    	return "welcome";
    }
}