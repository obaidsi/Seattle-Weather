import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class WeatherManager {
    private int weatherDayCount;
    private WeatherDay[] arrWeatherDay;


    public WeatherManager(String filePath) throws FileNotFoundException {
        // read the file
        File inFile = new File(filePath); // Creating the file
        Scanner sc = new Scanner(inFile); // Creating Scanner to read file
        weatherDayCount = sc.nextInt();   // Reading count of the file lines
        arrWeatherDay = new WeatherDay[weatherDayCount];    // Creating WeatherDay array size
        sc.nextLine(); // Throwing away the lines which has No useful data
        sc.nextLine();

        for (int idx = 0; idx < weatherDayCount; idx++) {
            String[] lineData = sc.nextLine().split(","); // Reading and parsing (from comma) each line of data
            Date date = new Date(Integer.parseInt(lineData[0]), Integer.parseInt(lineData[1]), Integer.parseInt(lineData[2]));  // Creating Objec of date
            arrWeatherDay[idx] = new WeatherDay(date, Integer.parseInt(lineData[3]), Integer.parseInt(lineData[5]), // Creating object of WeatherDay
                    Double.parseDouble(lineData[4]), Double.parseDouble(lineData[10]), Double.parseDouble(lineData[13]),
                    Double.parseDouble(lineData[18]));
        }
    }

    public int getWeatherDayCount() {
        return weatherDayCount;
    }

    public WeatherDay getWeatherDay(int idx) {
        return arrWeatherDay[idx];
    }

    public double findWeatherDay(Date date) {

        for (int idx = 0; idx < weatherDayCount; idx++) {
            if (arrWeatherDay[idx].getDate().equals(date)) {
                return idx;
            }
        }
        return -1;    // -1 indication that WeatherDay DNE for the given data.
    }

    public double calcAvgTemp(int year, int month, boolean whichTemp) {
        double temps = 0.0;
        double dayCounter = 0.0;

        for (int idx = 0; idx < weatherDayCount; idx++) {
            if (arrWeatherDay[idx].getDate().getYear() == year && arrWeatherDay[idx].getDate().getMonth() == month) {
                if (whichTemp) { // If True calc avgHigh Temperature
                    temps += arrWeatherDay[idx].getHighTemp(); // accumulating all high-temps for the month
                } else { // calc avgLowTemp
                    temps += arrWeatherDay[idx].getLowTemp(); // accumulating all low-temps for the month
                }
                dayCounter += 1;
            }
        }
        return temps / dayCounter;
    }

    public double calcRainTotal(int year, int month) {
        double rainTotal = 0.0;
        for (int idx = 0; idx < weatherDayCount; idx++) {
            if (arrWeatherDay[idx].getDate().getYear() == year && arrWeatherDay[idx].getDate().getMonth() == month) {
                rainTotal += arrWeatherDay[idx].getPrecipitation();
            }
        }
        return rainTotal;
    }

    public double calcRainiestMonth(int year) {
        double rainTotal = calcRainTotal(year, 1);
        double newRainTotal = 0.0;
        for (int month = 2; month <= 12; month++) {
            newRainTotal = calcRainTotal(year, month);
            if (newRainTotal > rainTotal) {
                rainTotal = newRainTotal;
            }
        }
        return rainTotal;
    }

    public DateRange calcLongestWarmingTrend(int year) {
        int trend = 0;
        int longestTrend = 0;
        int startIdx = 0;
        int endIdx = 0;
        double firstTemp = 0.0;
        double secondTemp = 0.0;
        for (int idx = 1; idx < weatherDayCount; idx++) {
            if (arrWeatherDay[idx].getDate().getYear() == year) {
                firstTemp = arrWeatherDay[idx - 1].getHighTemp();
                secondTemp = arrWeatherDay[idx].getHighTemp();
                if (secondTemp > firstTemp) {
                    trend++;
                    if (trend > longestTrend) {
                        longestTrend = trend;
                        startIdx = idx - longestTrend;
                        endIdx = idx;
                    }
                } else {
                    trend = 0;
                }
            }
        }
        return new DateRange(arrWeatherDay[startIdx].getDate(), arrWeatherDay[endIdx].getDate());
    }
}


