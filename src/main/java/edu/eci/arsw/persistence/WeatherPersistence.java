package edu.eci.arsw.persistence;

import java.util.Set;

import edu.eci.arsw.entities.City;

public interface WeatherPersistence {

	public City getCityByName(String namecity) throws WeatherPersistenceException;
	
	public void addCity(City city) throws WeatherPersistenceException; 
	
	public Set<City> getCities();
	
}
