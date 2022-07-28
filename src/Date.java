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

    /**
     * Retrieves the year
     * @return  year
     */
   public int getYear(){ return year; }

    /**
     * Retrieve the month
     * @return  month of the year
     */
   public int getMonth(){ return month; }

    /**
     * Retrieve the day
     * @return  day of the month
     */
   public int getDay(){ return day; }

    /**
     * Update year
     * @param year year
     */
   public void setYear(int year){ this.year = year; }

    /**
     * Update month of the year
     * @param month month of the year
     */
   public void setMonth(int month){ this.month = month;}

    /**
     * Updage day of the month
     * @param day   day of the month
     */
   public void setDay(int day){ this.day = day; }
}
