public class Date {
   private int year;
   private int month;
   private int day;

    /**
     * Full constructor for Date class
     * @param year  year
     * @param month month of the year
     * @param day   day of the month
     */
   public Date (int year, int month, int day){
       this.year = year;
       this.month = month;
       this.day = day;
   }
   public int getYear(){ return year; }
   public int getMonth(){ return month; }
   public int getDay(){ return day; }
   public void setYear(int year){ this.year = year; }
   public void setMonth(int month){ this.month = month;}
   public void setDay(int day){ this.day = day; }
}
