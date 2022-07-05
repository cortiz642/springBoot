package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class rollDiceController {
    @GetMapping("/rollDice")
    public String showNumber(){
        return "rollDice";
    }
    @PostMapping("/rollDice")
    public String joinDice(@RequestParam(name="roll") String number1, Model model){
        model.addAttribute("roll", "Your Number" + number1);
        return "rollDice";
    }
//    public String joinDices(@RequestParam(name="cohort") String number, Model models){
//        models.addAttribute("number", number);
//        return "rollDice";
//    }

}
