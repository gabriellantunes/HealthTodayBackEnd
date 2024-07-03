package br.univille.HealthToday.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String index(){
        HashMap<String, String> map = new HashMap<>();
        map.put("nome","Seja bem vindo ao HealthToday 2024");
        return "redirect:/login";
    }
}
