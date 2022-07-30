import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class WeatherManagerTest {

    @Test
    void testConstructor() throws FileNotFoundException {
        WeatherManager wM = new WeatherManager("SeattleWeather.txt");
        assertEquals(424, wM.getWeatherDayCount());
        assertEquals(8.0, wM.findWeatherDay(new Date(2018, 1, 9)));
    }

}