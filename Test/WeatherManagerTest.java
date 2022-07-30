import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class WeatherManagerTest {

    @Test
    void testConstructor() throws FileNotFoundException {
        WeatherManager wM = new WeatherManager("SeattleWeather.txt");
        assertEquals(424, wM.getWeatherDayCount());
        assertEquals(8.0, wM.findWeatherDay(new Date(2018, 1, 9)));
        Date date = new Date(2018, 1, 13);
        WeatherDay wD = new WeatherDay(date, 58, 45, 50.1, 90.4, 6.6, 0.08);
        assertEquals(wD.getDate(), wM.getWeatherDay(12).getDate());
    }

    @Test
    void testCalcAvgHighTemp() throws FileNotFoundException {
        WeatherManager wM = new WeatherManager("SeattleWeather.txt");
        assertEquals(45.1785, wM.calcAvgHighTemp(2018, 2), 0.0001);
    }
}