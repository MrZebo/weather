package model.apixu;

import com.google.gson.Gson;
import model.apixu.datamodel.ApixuWeatherModel;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIXUWeatherDate {
    private String APIURL = "http://api.apixu.com/v1";
    private ApixuWeatherModel apixuWeatherModel;
    private String key = "8480e6531ee540a28b9173746181203";
    String url = "";

    Gson gson = new Gson();

    public ApixuWeatherModel GetWeatherDataByAutoIP(int days) throws Exception {
        url = APIURL + "/forecast.json" + "?key=" + key + "&q=Dnepropetrowsk&days=" + days;
        System.out.println("url==========>" + url);

        ApixuWeatherModel tryApixuWeatherModel = GetData(url);

        return tryApixuWeatherModel;
    }

    //endregion

    private ApixuWeatherModel GetData(String url) {

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

                apixuWeatherModel = gson.fromJson(jObj.toString(), ApixuWeatherModel.class);


            } catch (ParseException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return apixuWeatherModel;


    }
}
