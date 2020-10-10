package com.witgreen.iot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    String showHomepage(){
        return "login";
    }
}
