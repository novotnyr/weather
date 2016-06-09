import static org.junit.Assert.assertEquals;

public class WeatherTest {
    @org.junit.Test
    public void test() throws Exception {
        Weather weather = new Weather();

        assertEquals(27, weather.getTemperature());

    }
}