package edu.eci.arsw.entities;

public class City {

	String name;
	String weather;
	
	
	public City(String name, String weather) {
		super();
		this.name = name;
		this.weather = weather;
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
