package main.webapp;

import main.webapp.model.wunderground.WGWeatherDate;
import main.webapp.model.wunderground.datamodel.HourlyForecastDay;
import main.webapp.model.wunderground.datamodel.WGWeatherModel;

public class Main {
    public static void main(String[] args) {
        WGWeatherDate date = new WGWeatherDate();
        try {
            WGWeatherModel model = date.GetWeatherDataByAutoIP();
//            for (SimpleForecastDay day : model.getForecast().getSimpleForecast().getSimpleForecastDays()) {
//                System.out.println(day.getDate().getMonthname() + " " + day.getDate().getDay() + " " + day.getDate().getWeekday() + " " + day.getPop());
//            }
            for (HourlyForecastDay day : model.getHourlyForecasts()) {
//                System.out.println(day.getFctTime().getPretty() + " " + day.getTemp().getMetric() + " " + day.getPop());
                System.out.println(day.getSimpleDate() + " " + day.getTemp().getMetric() + " " + day.getCondition() + " " +day.getPop());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}