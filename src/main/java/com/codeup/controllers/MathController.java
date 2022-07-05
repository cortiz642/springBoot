package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @GetMapping("/add/{num}/and/{num1}")
    @ResponseBody
    public int add(@PathVariable int num, @PathVariable int num1){
        return num + num1;

    }
    @GetMapping("/subtract/{num}/from/{num1}")
    @ResponseBody
    public int subtract(@PathVariable int num, @PathVariable int num1) {
        return num - num1;
    }
    @GetMapping("/multiply/{num}/and/{num1}")
    @ResponseBody
    public int multiply(@PathVariable int num, @PathVariable int num1) {
        return num * num1;
    }
    @GetMapping("/divide/{num}/by/{num1}")
    @ResponseBody
    public int divide(@PathVariable int num, @PathVariable int num1) {
        return num / num1;
    }
}
