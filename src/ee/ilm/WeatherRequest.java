package ee.ilm;

public class WeatherRequest {
    public String city;
    public String country;
    public String units;
    public Double lat;
    public Double lon;

    public WeatherRequest(String city, String country, String units) {
        this.city = city;
        this.country = country;
        this.units = units;
    }

    public WeatherRequest(Double lat, Double lon, String units) {
        this.lat = lat;
        this.lon = lon;
        this.units = units;
    }
}
