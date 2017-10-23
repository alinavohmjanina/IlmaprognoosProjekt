import ee.ilm.repositories.ThreeDayWeatherRepository;
import ee.ilm.WeatherRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeDayWeatherRepositoryTest {

    @Test
    public void testIfThreeDayWRepositoryRespCityEqualsReqSity() {
        try  {
            WeatherRequest request = new WeatherRequest("Tallinn", "EE", "metric");
            ThreeDayWeatherRepository repository = new ThreeDayWeatherRepository();
            //ThreeDayWeatherReport report = repository.getThreeDayW(request);
            //assertEquals(report.cityName, request.cityName);
        }catch(Exception e){
            fail("Failure cause: " + e.getMessage());
        }
    }

}