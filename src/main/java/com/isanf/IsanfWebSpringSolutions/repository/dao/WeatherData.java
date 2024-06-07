package com.isanf.IsanfWebSpringSolutions.repository.dao;

import java.util.List;

//R 4
public class WeatherData {
    private Main main;
    private String name; // Nom de la ville
//    private Sys sys;     // Informations sur le pays, lever/coucher du soleil
//    private List<Weather> weather; // Description du temps (nuageux, pluie, etc.)
//    private Wind wind;   // Informations sur le vent

    // Getters et setters pour main
    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    // Getters et setters pour les autres champs (name, sys, weather, wind)
    // ... (ajoutez les getters et setters pour chaque champ ici)
}

