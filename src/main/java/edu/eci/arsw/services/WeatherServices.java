package edu.eci.arsw.services;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.eci.arsw.entities.City;
import edu.eci.arsw.persistence.WeatherPersistence;
import edu.eci.arsw.persistence.WeatherPersistenceException;
import edu.eci.arsw.persistence.impl.*;

@Service
public class WeatherServices {
	
	@Autowired
	@Qualifier("inMemoryWeatherPersistence")
	WeatherPersistence wps;
	
	public City getCityByName(String namecity) {
		try {
			return wps.getCityByName(namecity);
		} catch (WeatherPersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Set<City> getCities(){
		return wps.getCities();
	}
	
}
