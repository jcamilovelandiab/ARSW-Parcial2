package edu.eci.arsw.persistence;

import java.util.Set;

import edu.eci.arsw.entities.City;

public interface WeatherPersistence {

	/**
	 * Consulta una ciudad dada su nombre, si la ciudad que se va a consultar ya esta
	 * en memoria y su creacion fue hace mas de 5 minutos, se vuelve a consultar el estado
	 * del clima de la ciudad.
	 * 
	 * @param namecity
	 * @return
	 * @throws WeatherPersistenceException
	 */
	public City getCityByName(String namecity) throws WeatherPersistenceException;
	
	/**
	 * Agrega la ciudad a persistence
	 * @param city
	 * @throws WeatherPersistenceException
	 */
	public void addCity(City city) throws WeatherPersistenceException; 
	
	
	/**
	 * Obtiene todas las ciudades registradas
	 * @return
	 */
	public Set<City> getCities();
	
}
