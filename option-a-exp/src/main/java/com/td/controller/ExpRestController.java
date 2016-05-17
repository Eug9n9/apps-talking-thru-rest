package com.td.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.td.data.Bag;
import com.td.service.ExpService;

@RestController
public class ExpRestController {

    @Autowired
    private ExpService service;

    @RequestMapping("/createInfo")
    @ResponseBody
    public Bag create() {
		return service.createData();
    }

    @RequestMapping("/loadInfo/{refId}")
    @ResponseBody
    public Bag get(@PathVariable("refId") String refId) {
        return service.getData(refId);
    }

    @RequestMapping(value="/updateInfo", method=RequestMethod.POST)
    @ResponseBody
    public Bag set(@RequestBody Bag bag) {
    	return service.updateData(bag);
    }
}