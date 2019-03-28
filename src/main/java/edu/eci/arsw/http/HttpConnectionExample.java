package edu.eci.arsw.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpConnectionExample {

    private static final String USER_AGENT = "Mozilla/5.0";
    //private static String GET_URL =  "http://api.openweathermap.org/data/2.5/weather?q="+name+"&APPID=6a88236a0c6c460d59f23c2bdafcf1b7";
    private static String GET_URL;

    public static String getWeather(String namecity) {

    	GET_URL = "http://api.openweathermap.org/data/2.5/weather?q="+namecity+"&APPID=eeb607ce7137b343fd9799ff0acb89da";
    	
        URL obj;
		try {
			obj = new URL(GET_URL);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	        con.setRequestMethod("GET");
	        con.setRequestProperty("User-Agent", USER_AGENT);
	        
	        //The following invocation perform the connection implicitly before getting the code
	        int responseCode = con.getResponseCode();
	        System.out.println("GET Response Code :: " + responseCode);
	        
	        if (responseCode == HttpURLConnection.HTTP_OK) { // success
	            BufferedReader in = new BufferedReader(new InputStreamReader(
	                    con.getInputStream()));
	            String inputLine;
	            StringBuffer response = new StringBuffer();

	            while ((inputLine = in.readLine()) != null) {
	                response.append(inputLine);
	            }
	            in.close();

	            // print result
	            return response.toString();
	        } else {
	            return "not worked";
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "not worked";
     
    }

}