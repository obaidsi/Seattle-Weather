public class DateRange {
    private Date start;
    private Date end;

    /**
     * Full constructor for DateRange
     * @param start start Date
     * @param end end Date
     */
    public DateRange(Date start, Date end){
        this.start = start;
        this.end   = end;
    }

    /**
     * Retrieves the start Date
     * @return  start date
     */
    public Date getStart(){ return start; }

    /**
     * Retrieves the end date
     * @return  return the end date
     */
    public Date getEnd(){ return end; }

    /**
     * Update the start date
     * @param start start date
     */
    public void setStart(Date start){ this.start = start; }

    /**
     * Update the end date
     * @param end   end date
     */
    public void setEnd(Date end){ this.end = end; }
}
