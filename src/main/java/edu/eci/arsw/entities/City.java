package edu.eci.arsw.entities;

import java.util.Date;

public class City {

	String name;
	String weather;
	Date date = new Date();
	
	/**
	 * 
	 * @param name
	 * @param weather
	 */
	public City(String name, String weather) {
		this.name = name;
		this.weather = weather;		
	}
	
	
	public Date getDate() {
		return date;
	}


	public void setDate(Date fecha) {
		this.date = fecha;
	}


	@Override
	public String toString() {
		return "City [name=" + name + ", weather=" + weather + "]";
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getWeather() {
		return weather;
	}
	
	
	
	public void setWeather(String weather) {
		this.weather = weather;
	}

}
