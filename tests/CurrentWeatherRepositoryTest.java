import ee.ilm.reports.CurrentWeatherReport;
import ee.ilm.repositories.CurrentWeatherRepository;
import ee.ilm.WeatherRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentWeatherRepositoryTest {

    @Test
    public void testIfWeatherRepositoryRespCityEqualsReqSity() {
        try  {
            WeatherRequest request = new WeatherRequest("Tallinn", "EE", "metric");
            CurrentWeatherRepository repository = new CurrentWeatherRepository();
            CurrentWeatherReport report = repository.getCurrentWeather(request);

            assertEquals(report.city, request.city);
            assertEquals(report.country, request.country);
            assertNotNull(report.curTemperature);
            assertNotNull(report.minTemperature);
            assertNotNull(report.maxTemperature);
        }catch(Exception e){
            fail("Failure cause: " + e.getMessage());
        }
    }
}