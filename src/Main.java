import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WeatherManager wM = new WeatherManager("SeattleWeather.txt");
        Date date = new Date(2018, 1, 9);
        System.out.println(wM.getWeatherDay(8));
        System.out.println(wM.findWeatherDay(date));
        double avgHighTemp = wM.calcAvgTemp(2018, 2, true);
        System.out.println(avgHighTemp + "\n");
        System.out.println("\n" + wM.calcRainiestMonth(2019) + "\n");
        System.out.println(wM.calcLongestWarmingTrend(2018));
        System.out.println(wM.calcLongestWarmingTrend(2019));
    }
}
