package com.tictac; // Indispensable : doit correspondre à tes dossiers

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main 
{
    public static void main(String[] args) 
    {
        // Lance le serveur Web Tomcat intégré
        SpringApplication.run(Main.class, args); 
        System.out.println("Server is running on port 8080");
    }
}
