import ee.ilm.reports.GeoWeatherReport;
import ee.ilm.repositories.GeoWeatherRepository;
import ee.ilm.WeatherRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoWeatherRepositoryTest {

    @Test
    public void testIfGeoRepositoryRespCityEqualsReqSity() {
        try  {
            WeatherRequest request = new WeatherRequest(40.0, 65.0, "metric");
            GeoWeatherRepository repository = new GeoWeatherRepository();
            GeoWeatherReport report = repository.getGeoWeather(request);

            assertEquals(report.lat, request.lat);
            assertEquals(report.lon, request.lon);
            assertNotNull(report.curTemperature);
            assertNotNull(report.minTemperature);
            assertNotNull(report.maxTemperature);
        }catch(Exception e){
            fail("Failure cause: " + e.getMessage());
        }
    }
}