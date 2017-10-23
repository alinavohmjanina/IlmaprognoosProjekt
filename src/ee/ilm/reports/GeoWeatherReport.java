package ee.ilm.reports;

import org.json.JSONObject;

public class GeoWeatherReport extends Report {
    public GeoWeatherReport(JSONObject data) {
        this.city = data.getString("name");
        this.country = data.getJSONObject("sys").getString("country");
        this.lon = data.getJSONObject("coord").getDouble("lon");
        this.lat = data.getJSONObject("coord").getDouble("lat");
        this.curTemperature = data.getJSONObject("main").getDouble("temp");
        this.minTemperature = data.getJSONObject("main").getDouble("temp_min");
        this.maxTemperature = data.getJSONObject("main").getDouble("temp_max");
    }
}
