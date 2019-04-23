package main.webapp.servlet;

import main.webapp.model.apixu.APIXUWeatherDate;
import main.webapp.model.apixu.datamodel.APIxuForecastDay;
import main.webapp.model.apixu.datamodel.ApixuWeatherModel;
import main.webapp.model.gismeteo.GisMeteoDailyForecast;
import main.webapp.model.gismeteo.GisMeteoHtmlParser;
import main.webapp.model.meteopost.MeteoPostDailyForecast;
import main.webapp.model.meteopost.MeteoPostHtmlParser;
import main.webapp.model.openweather.OpenWeatherWeatherDate;
import main.webapp.model.openweather.datamodel.OpenWeatherForecastDay;
import main.webapp.model.openweather.datamodel.OpenWeatherWeatherModel;
import main.webapp.model.wunderground.WGWeatherDate;
import main.webapp.model.wunderground.datamodel.HourlyForecastDay;
import main.webapp.model.wunderground.datamodel.WGWeatherModel;

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
