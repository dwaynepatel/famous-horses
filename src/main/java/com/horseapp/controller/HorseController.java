package com.horseapp.controller;

import com.horseapp.data.HorseRepository;
import com.horseapp.model.Horse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HorseController {
    @Autowired
    private HorseRepository horseRepository;

    @RequestMapping (value = "/")
    public String homePage(ModelMap modelMap){
        List<Horse> allHorses = horseRepository.listOfHorses();
        modelMap.put("horses", allHorses);
    return "home";
    }

// horseName is a path variable and also the dynamic part of the request to find the emoji
    @RequestMapping(value= "/horse/{horseName}")
    public String emojisPage(@PathVariable String horseName, ModelMap modelMap){ // take in paramater ModelMap
        Horse horse = horseRepository.findHorseFileName(horseName);
        modelMap.put("horse",horse);
        return "horse";
    }
}
