package servlet;

import model.apixu.APIXUWeatherDate;
import model.apixu.datamodel.APIxuForecastDay;
import model.apixu.datamodel.ApixuWeatherModel;
import model.gismeteo.GisMeteoDailyForecast;
import model.gismeteo.GisMeteoHtmlParser;
import model.meteopost.MeteoPostDailyForecast;
import model.meteopost.MeteoPostHtmlParser;
import model.openweather.OpenWeatherWeatherDate;
import model.openweather.datamodel.OpenWeatherForecastDay;
import model.openweather.datamodel.OpenWeatherWeatherModel;
import model.wunderground.WGWeatherDate;
import model.wunderground.datamodel.HourlyForecastDay;
import model.wunderground.datamodel.WGWeatherModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "")
public class MyServlet extends HttpServlet {

    private List<APIxuForecastDay> daysAPIxu;
    private List<OpenWeatherForecastDay> daysOPENWEATHER;
    private List<MeteoPostDailyForecast> meteoPostDays;
//    private List<SimpleForecastDay> simpleForecastDays;
    private List<GisMeteoDailyForecast> gisMeteoDailyForecasts;
    private List<HourlyForecastDay> hourlyForecastDays;

    @Override

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        APIXUWeatherDate date = new APIXUWeatherDate();
        OpenWeatherWeatherDate date2 = new OpenWeatherWeatherDate();
        MeteoPostHtmlParser parser = new MeteoPostHtmlParser();
        GisMeteoHtmlParser gisMeteoHtmlParser = new GisMeteoHtmlParser();
        WGWeatherDate wgWeatherDate = new WGWeatherDate();
        try {
            ApixuWeatherModel model = date.GetWeatherDataByAutoIP(10);
            daysAPIxu = model.getForecast().getForecastDay();
            OpenWeatherWeatherModel model2 = date2.GetWeatherData();
            daysOPENWEATHER = model2.getOpenWeatherForecastDays();
            meteoPostDays = parser.getWeatherModels();
            WGWeatherModel wgWeatherModel = wgWeatherDate.GetWeatherDataByAutoIP();
//            simpleForecastDays = wgWeatherModel.getForecast().getSimpleForecast().getSimpleForecastDays();
            gisMeteoDailyForecasts = gisMeteoHtmlParser.getForecasts();
            hourlyForecastDays = wgWeatherModel.getHourlyForecasts();
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("daysAPIxu", daysAPIxu);
        req.setAttribute("daysOPENWEATHER", daysOPENWEATHER);
        req.setAttribute("meteoPostDays", meteoPostDays);
        req.setAttribute("hourlyForecastDays", hourlyForecastDays);
        req.setAttribute("gisMeteoDailyForecasts", gisMeteoDailyForecasts);
//        String varTextA = "Hello World!";
//        req.setAttribute("textA", varTextA);
//        req.getSession().setAttribute("textA", varTextA);
//        String varTextB = "It JSP.";
//        req.setAttribute("textB", varTextB);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

    }

    public MyServlet() {
    }
}
