package ee.ilm.repositories;

import ee.ilm.reports.CurrentWeatherReport;
import ee.ilm.WeatherRequest;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class CurrentWeatherRepository {
    protected String apiKey = "23ea3da32859e7f34bdd593f012cf7b9";

    public CurrentWeatherReport getCurrentWeather(WeatherRequest request) throws IOException {
        String url = "https://api.openweathermap.org/data/2.5/weather?q="+request.city+","+request.country+"&units="+request.units+"&APPID="+this.apiKey;
        String json = this.readJsonFromUrl(url);
        JSONObject data = new JSONObject(json);

        return new CurrentWeatherReport(data);
    }

    public String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;

        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }

        return sb.toString();
    }

    public String readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();

        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));

            return readAll(rd);
        } finally {
            is.close();
        }
    }
}
