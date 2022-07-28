public class WeatherDay {
    private Date date;
    private int highTemp;
    private int lowTemp;
    private double avgTemp;
    private double avgHumidity;
    private double avgWind;
    private double precipitation;

    public WeatherDay(Date date, int highTemp, int lowTemp, double avgTemp,
                      double avgHumidity, double avgWind, double precipitation){
        this.date = date;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        this.avgTemp = avgTemp;
        this.avgHumidity = avgHumidity;
        this.avgWind = avgWind;
        this.precipitation = precipitation;
    }
    public Date getDate(){ return date; }
    public int getHighTemp(){ return highTemp; }
    public int getLowTemp(){ return lowTemp;};
    public double getAvgTemp(){ return avgTemp; }
    public double getAvgHumidity(){ return avgHumidity;}
    public double getAvgWind(){ return avgWind;}
    public double getPrecipitation(){ return precipitation;}
    public double calcHeathIndex(){
        int t = highTemp;
        double h = avgHumidity;
        double heathIndex = -42.379*t + 2.04901523*h + 10.14333127*h -
                0.22475541*t*h - 0.00683783*t*t + -0.054817117*h*h +
                0.00122874*t*t*h +0.00085282*t*h*h - 0.00000199*t*t*h*h;
        return heathIndex;
    }
}
