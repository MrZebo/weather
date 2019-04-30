package model.openweather;

import com.google.gson.Gson;
import model.openweather.datamodel.OpenWeatherWeatherModel;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenWeatherWeatherDate {

    private String API_KEY = "3f8ddf668e73e4d194fd2ea7a180d812";
    private String url = "http://api.openweathermap.org/data/2.5/forecast?q=Dnipropetrovsk&appid=" + API_KEY;
    //http://api.openweathermap.org/data/2.5/forecast?q=Dnipropetrovsk&appid=3f8ddf668e73e4d194fd2ea7a180d812
    private OpenWeatherWeatherModel openWeatherWeatherModel;

    Gson gson = new Gson();

    public OpenWeatherWeatherModel GetWeatherData() throws Exception {
//        url = APIURL + "/forecast?" + "?key=" + key + "&q=auto:ip&days=" + days;
        System.out.println("url==========>" + url);

        OpenWeatherWeatherModel tryOpenWeatherWeatherModel = GetData(url);

        return tryOpenWeatherWeatherModel;
    }


    private OpenWeatherWeatherModel GetData(String url) {
        URL obj;
        try {
            obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            con.setRequestMethod("GET");

            con.setRequestProperty("User-Agent", "user");

            int responseCode = con.getResponseCode();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream(),"UTF-8"));
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

                openWeatherWeatherModel = gson.fromJson(jObj.toString(), OpenWeatherWeatherModel.class);


            } catch (ParseException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return openWeatherWeatherModel;


    }
}
