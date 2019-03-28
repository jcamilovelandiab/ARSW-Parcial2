app=(function(){
	
	return{
		getWeatherByCityName:function(namecity){
			return apiclient.getWeatherByCityName(namecity, function(city){
				//var weather = city.weather;
				console.log(city);
			})
		}
	}
})();