import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DateTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Date#Date(int, int, int)}
     *   <li>{@link Date#setDay(int)}
     *   <li>{@link Date#setMonth(int)}
     *   <li>{@link Date#setYear(int)}
     *   <li>{@link Date#getDay()}
     *   <li>{@link Date#getMonth()}
     *   <li>{@link Date#getYear()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Date actualDate = new Date(1, 1, 1);
        actualDate.setDay(2);
        actualDate.setMonth(2);
        actualDate.setYear(2);
        assertEquals(2, actualDate.getDay());
        assertEquals(2, actualDate.getMonth());
        assertEquals(2, actualDate.getYear());
    }
}

