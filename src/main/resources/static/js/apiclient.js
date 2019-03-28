apiclient=(function(){
	return {
		console.log("LLEGUE");
		getWeatherByCityName:function(name,callback){
			console.log(name);
			$.get("/v1/weathers/" + name, function(data) {
				callback(data);
			});
		}
	}
})();