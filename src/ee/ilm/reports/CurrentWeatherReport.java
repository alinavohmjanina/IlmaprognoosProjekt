package ee.ilm.reports;

import org.json.JSONObject;

public class CurrentWeatherReport extends Report {
    public CurrentWeatherReport(JSONObject data) {
        this.city = data.getString("name");
        this.country = data.getJSONObject("sys").getString("country");
        this.curTemperature = data.getJSONObject("main").getDouble("temp");
        this.minTemperature = data.getJSONObject("main").getDouble("temp_min");
        this.maxTemperature = data.getJSONObject("main").getDouble("temp_max");
    }
}
