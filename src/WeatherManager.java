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

    public double calcAvgHighTemp(int year, int month) {
        double highTemp = 0.0;
        double dayCounter = 0.0;

        for (int idx = 0; idx < weatherDayCount; idx++) {
            if (arrWeatherDay[idx].getDate().getYear() == year && arrWeatherDay[idx].getDate().getMonth() == month) {
                highTemp += arrWeatherDay[idx].getHighTemp(); // accumulating all high-temps for the month
                dayCounter += 1;
                continue;
            }
        }
        return highTemp / dayCounter;
    }

    public double calcAvgLowTemp(int year, int month) {
        return 0.5; // To be calculated
    }

    public double calcRainTotal(int year, int month) {
        return 0.5; // To be calculated
    }

    public int calcRainiestMonth(int year) {
        return 3;
    } // To be calculated
}

// public DateRange calcLongestWarmingTrend(int year) return new DateRange;}

