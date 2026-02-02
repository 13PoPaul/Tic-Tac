package com.tictac; // 1. L'adresse

import org.springframework.stereotype.Controller; // 2. L'outil
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller // 3. L'étiquette magique
public class QuestionController 
{

    @GetMapping("/") // 1. On écoute l'adresse principale
    public String accueil() 
    {
        return "index";
    }
    @PostMapping("/result") // 2. On récupère les données du formulaire
    public String result(@RequestParam("Sex") int sex, Model model) 
    {
        model.addAttribute("SexChosen", sex);
        return "result";
    }

}