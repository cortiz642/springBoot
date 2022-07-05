package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

//    @GetMapping("/hello")
////    @ResponseBody
//    public String hello(){
//        return "Hello from Groovy Spring!";
//    }
//    @GetMapping("/hello/{name}")
//    @ResponseBody
//    public String sayHello(@PathVariable String name, Model model){
//        model.addAttribute
//                ("urlInput", name);
//        return "hello";
////        return "Hello " + name + "!";
//    }

@GetMapping("/join")
public String showJoinForm() {
    return "join";
}

    @PostMapping("/join")
    public String joinCohort12(@RequestParam(name = "cohort") String cohort, Model model) {
        model.addAttribute("cohort", "Welcome to " + cohort + "!");
        return "join";
    }
}

