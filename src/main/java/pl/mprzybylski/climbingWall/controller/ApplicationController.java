package pl.mprzybylski.climbingWall.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("hello")
    public String home() {
        return "hello";
    }

}
