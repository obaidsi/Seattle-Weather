import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherDayTest {
    @Test
    void testConstructor(){
        Date date = new Date(1, 2, 3);
        WeatherDay wd = new WeatherDay(date, 44, 2, 4.4, 5.5, 10, 6);
        assertEquals(date, wd.getDate());
        assertEquals(44, wd.getHighTemp());
        assertEquals(2, wd.getLowTemp());
        assertEquals(4.4, wd.getAvgTemp());
        assertEquals(5.5, wd.getAvgHumidity());
        assertEquals(10, wd.getAvgWind());
        assertEquals(6, wd.getPrecipitation());
    }

}