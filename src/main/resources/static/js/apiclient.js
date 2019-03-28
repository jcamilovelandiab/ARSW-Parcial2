apiclient=(function(){
	return {
		
		getWeatherByCityName:function(name,callback){
			console.log("LLEGUE");
			console.log(name);
			$.get("/v1/weathers/" + name, function(data) {
				callback(data);
			});
		}
	}
})();