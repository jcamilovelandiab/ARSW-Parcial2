app=(function(){
	
	return{
		getWeatherByCityName:function(namecity){
			return apiclient.getWeatherByCityName(namecity, function(city){
				var weatherTxt = city.weather;
				var info = JSON.parse(weatherTxt);
				console.log(weatherTxt);
				console.log(info);
				
				var table = $("#tableCity");
				$("#tableCity > tr").remove();
				
				table.append('<tr>' + 
						"<td> lat -> "+info.coord.lat+" ,lon -> "+info.coord.lon+"</td>" + 
						"<td>"+info.weather[0].description+"</td>" + 
						"<td>"+info.main.humidity+"</td>"+ 
						"<td>"+info.main.pressure+"</td>"+
						"<td>"+info.main.temp+"</td>"+
						"</tr>");
			})
		}
	}
})();