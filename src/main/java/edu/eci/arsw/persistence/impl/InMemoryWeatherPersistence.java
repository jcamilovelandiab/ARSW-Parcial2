package edu.eci.arsw.persistence.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import edu.eci.arsw.entities.City;
import edu.eci.arsw.http.HttpConnectionExample;
import edu.eci.arsw.persistence.WeatherPersistence;
import edu.eci.arsw.persistence.WeatherPersistenceException;

@Component("inMemoryWeatherPersistence")
public class InMemoryWeatherPersistence implements WeatherPersistence{

	Map<String, City> cities = new HashMap<String,City>();
	
	
	InMemoryWeatherPersistence(){
		
		City c = new City("bogota", "frio");
		cities.put(c.getName(), c);
		
	}
	
	@Override
	public City getCityByName(String namecity) throws WeatherPersistenceException {
		if(cities.containsKey(namecity)) {
			return cities.get(namecity);
		}else {
			String weather = HttpConnectionExample.getWeather(namecity);
			City c = new City(namecity, weather);
			addCity(c);
			return c;
		}
	}


	@Override
	public void addCity(City city) throws WeatherPersistenceException {
		if(!cities.containsKey(city.getName())) {
			cities.put(city.getName(), city);
		}else {
			throw new WeatherPersistenceException("The city already exists");
		}
	}

	@Override
	public Set<City> getCities() {
		Set<City> citiesAll = new HashSet<City>();
		for (Map.Entry<String, City> c: cities.entrySet()) {
			citiesAll.add(c.getValue());
		}
		return citiesAll;
	}
	
	

}
