package com.td.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.td.data.Bag;

@RestController
public class ExtRestController {

    @Value("${experience.application.url}")
    private String experienceUrl;

    @RequestMapping("/loadInfo/{refId}")
    @ResponseBody
    public Bag get(@PathVariable("refId") String refId) {
        RestTemplate restTemplate = new RestTemplate();
        Bag info = restTemplate.getForObject(experienceUrl + "loadInfo/" + refId, Bag.class);
        return info;
    }

    @RequestMapping(value="/updateInfo", method=RequestMethod.POST)
    @ResponseBody
    public Bag set(@RequestBody Bag bag) {
        RestTemplate restTemplate = new RestTemplate();
        Bag info = restTemplate.postForObject(experienceUrl + "updateInfo", bag, Bag.class);
        return info;
    }
}