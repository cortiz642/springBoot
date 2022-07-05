package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
//    @GetMapping("/home")
////    @ResponseBody
//    public String home(){
////        return "This is the landing page!";
//        return "home";

        @GetMapping("/join")
        public String showJoinForm() {
            return "join";
        }

        @PostMapping("/join")
        public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model) {
            model.addAttribute("cohort", "Welcome to " + cohort + "!");
            return "join";
        }
    }

