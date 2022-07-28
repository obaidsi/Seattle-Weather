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
        actualDate.setDay(1);
        actualDate.setMonth(1);
        actualDate.setYear(1);
        assertEquals(1, actualDate.getDay());
        assertEquals(1, actualDate.getMonth());
        assertEquals(1, actualDate.getYear());
    }
}

