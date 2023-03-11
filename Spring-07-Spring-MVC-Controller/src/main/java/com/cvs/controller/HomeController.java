package com.cvs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
EX: when we send following endpoint http://localhost:9090/home in browser, to dispatcher server, it will look for all the
classes that annotated with @Controller and look for method that annotated with @RequestMapping("/home")
 */

@Controller //Annotate the class with the @Controller stereotype annotation
public class HomeController {

    @RequestMapping("/home") //Use @RequestMapping annotation to associate the action with an HTTP request path
    public String home(){

        return "home.html"; //Return the HTML document name that contains the details we want the browser to display
    }

    @RequestMapping("/welcome")
    public String home2(){

        return "welcome.html";
    }

    // If we don't provide anything to endpoint, it takes the default option @RequestMapping("/") which is slash
    @RequestMapping
    public String home3(){

        return "welcome.html"; // In Default Spring looking for a Html static pages under static folder.
    }


}
