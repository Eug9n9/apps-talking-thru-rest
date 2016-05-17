package com.td.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpController {

    @Value("${external.application.url}")
    private String externalUrl;

    @ModelAttribute("externalUrl")
    public String getExternalUrl() {
    	return externalUrl;
    }

    @RequestMapping("/")
    public String welcome() {
    	return "welcome";
    }
}