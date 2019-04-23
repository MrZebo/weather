package main.webapp.model.wunderground;

import com.google.gson.Gson;
import main.webapp.model.wunderground.datamodel.WGWeatherModel;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WGWeatherDate {
    private String APIURL = "http://api.wunderground.com/api/";
    private WGWeatherModel wgWeatherModel;
    private String key = "0a9a6a08d1b3e7ff";
    String url = "";

    Gson gson = new Gson();

    public WGWeatherModel GetWeatherDataByAutoIP() throws Exception {
        //http://api.wunderground.com/api/0a9a6a08d1b3e7ff/forecast10day/lang:RU/q/autoip.json   simpleforecast and txt_forecast
        //http://api.wunderground.com/api/0a9a6a08d1b3e7ff/hourly10day/q/UA/Dnipropetrovs'k.json   hourly forecast
//        url = APIURL + key + "/forecast10day/lang:RU/q/Dnipropetrovs'k.json";
        url = "http://api.wunderground.com/api/0a9a6a08d1b3e7ff/hourly10day/q/UA/Dnipropetrovs'k.json";
        System.out.println("url==========>" + url);

        WGWeatherModel wgWeatherModel = GetData(url);

        return wgWeatherModel;
    }


    private WGWeatherModel GetData(String url) {

        URL obj;
        try {
            obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            con.setRequestMethod("GET");

            con.setRequestProperty("User-Agent", "user");

            int responseCode = con.getResponseCode();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "UTF-8"));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();


            JSONParser parser = new JSONParser();

            try {
                Object obj1 = parser.parse(response.toString());


                JSONObject jObj = (JSONObject) obj1;

                wgWeatherModel = gson.fromJson(jObj.toString(), WGWeatherModel.class);


            } catch (ParseException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return wgWeatherModel;


    }
}
