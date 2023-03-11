package com.cvs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    // use @RequestParam annotation for query parameters
    //we bring our query parameter from browser to java code
    @RequestMapping("/info")       //localhost:8080/car/info?make=Honda&year=2015
    public String carInfo(@RequestParam String make, @RequestParam Integer year, Model model){

        // we're capturing attributeName make which coming from browser, and we are passing make which coming from browser to the view
        // we are capturing everything into our code and passing it into HTML
        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info";
    }

    // Query parameters can be optional
    @RequestMapping("/info2") //localhost:8080/car/info2
    // car/info2 -> @RequestParam(value = "make",required = false): - it will return nothing
    // car/info2 -> @RequestParam(value = "make",required = false,defaultValue = "Tesla"): - will return default value Tesla
    // car/info2?make=Nissan -> @RequestParam(value = "make",required = false,defaultValue = "Tesla"): - will return Nissan
    public String carInfo2(@RequestParam(value = "make",required = false,defaultValue = "Tesla") String make, Model model){


        model.addAttribute("make",make);

        return "car/car-info";
    }

    // Path Variable can NOT be optional
    @RequestMapping("/info/{make}/{year}")      //localhost:8080/car/info/honda/2015
    public String getCarInfo(@PathVariable String make, @PathVariable Integer year, Model model){
        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info";
    }




}
