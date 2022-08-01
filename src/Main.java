import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WeatherManager wM = new WeatherManager("SeattleWeather.txt");
        Date date = new Date(2018, 1, 9);
        System.out.println(wM.getWeatherDay(8));
        System.out.println(wM.findWeatherDay(date));
        double avgHighTemp = wM.calcAvgTemp(2018, 2, true);
        System.out.println(avgHighTemp + "\n");
        for (int month = 1; month <= 12; month++) {
            double rainTotal = wM.calcRainTotal(2019, month);
            System.out.println(rainTotal);
        }
        System.out.println("\n" + wM.calcRainiestMonth(2019));
    }
}
