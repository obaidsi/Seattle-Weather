import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateRangeTest {
    /**
     * Methods under Test:
     *
     * Constructor
     * getStart()
     * getEnd()
     * setStart(Date)
     * setEnd(Date)
     */
    @Test
    void testConstructor() {
        Date dS = new Date(3, 5, 7);
        Date dE = new Date(2, 6, 8);
        DateRange dt = new DateRange(dS, dE);
        Date checkA = new Date(1, 3, 6);
        dt.setStart(checkA);
        Date checkB = new Date(6, 9, 12);
        dt.setEnd(checkB);
        assertEquals(checkA, dt.getStart());
        assertEquals(checkB, dt.getEnd());
    }

}