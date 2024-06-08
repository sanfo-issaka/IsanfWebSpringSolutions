package com.isanf.IsanfWebSpring.repository.dao;

//R 4
//Classe interne pour les informations principales de la météo
public class Main {
	 private double temp;       // Température en Kelvin
	 private double feels_like; // Température ressentie
	 private double temp_min;   // Température minimale
	 private double temp_max;   // Température maximale
	 private int pressure;      // Pression atmosphérique
	 
	 public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getFeels_like() {
		return feels_like;
	}
	public void setFeels_like(double feels_like) {
		this.feels_like = feels_like;
	}
	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	private int humidity;      // Humidité

 // Getters et setters pour les champs de Main
 // ... (ajoutez les getters et setters pour chaque champ ici)
}

//Autres classes internes (Sys, Weather, Wind) avec leurs champs et getters/setters
//... (ajoutez les classes et leurs membres ici si nécessaire)