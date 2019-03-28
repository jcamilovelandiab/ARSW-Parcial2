package edu.eci.arsw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.http.HttpConnectionExample;
import edu.eci.arsw.services.WeatherServices;

@RestController
@RequestMapping(value = "v1/weathers")
public class WeatherController {

	@Autowired
	WeatherServices weatherServices;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getCityByName(){
		try {
			return new ResponseEntity<>(weatherServices.getCities(), HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>("ERROR", HttpStatus.NOT_FOUND);
		}
	}
	
	
	@RequestMapping(value = "/{namecity}", method = RequestMethod.GET)
	public ResponseEntity<?> getCityByName(@PathVariable String namecity){
		try {
			//return new ResponseEntity<>(weatherServices.getCityByName(namecity), HttpStatus.OK);
			return new ResponseEntity<>(HttpConnectionExample.getWeather(namecity), HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>("ERROR", HttpStatus.NOT_FOUND);
		}
	}
	
}
