package com.tictac; // 1. L'adresse

import org.springframework.stereotype.Controller; // 2. L'outil
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Controller // 3. L'étiquette magique
public class ControllerWeb
{

    @GetMapping("/") // 1. On écoute l'adresse principale
    public String accueil() 
    {
        return "index";
    }
    @PostMapping("/result") // 2. On récupère les données du formulaire
    public String result(@RequestParam("Sex") int sex, 
    @RequestParam("DateBirthSelectionD") int D, 
    @RequestParam("DateBirthSelectionM") int M,
    @RequestParam("DateBirthSelectionY") int Y,
     Model model) 
    {
        if (sex == 1)
        {
            sex = 71;
        }
        else sex = 75;
        
        model.addAttribute("NumberYears", sex);

        // Calcul de l'âge
        LocalDate birthDate = LocalDate.of(Y, M, D);
        LocalDate currentDate = LocalDate.now();
        long WeeksLived = ChronoUnit.WEEKS.between(birthDate, currentDate);
        int semainesRestantes = 52 * sex - WeeksLived;

        model.addAttribute("NumberYearsLived", WeeksLived);
        model.addAttribute("NumberWeeksLeft", semainesRestantes);
        return "result";
    }

}