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
    void testCalcMethods() throws FileNotFoundException {
        WeatherManager wM = new WeatherManager("SeattleWeather.txt");
        assertEquals(45.1785, wM.calcAvgTemp(2018, 2, true), 0.0001);
        assertEquals(36.8214, wM.calcAvgTemp(2018, 2, false), 0.0001);
        assertEquals(2.59, wM.calcRainTotal(2018, 3), 0.01);
        DateRange dR = new DateRange(new Date(2018, 8, 2), new Date(2018, 8, 8));
        assertEquals(dR, wM.calcLongestWarmingTrend(2018));
    }

}