import org.junit.Test;

import static org.junit.Assert.*;

public class CalenderTest {

    @Test
    public void isLeapYear() {
        Calender calender = new Calender();
        calender.setYear(2000);
        assertTrue(calender.isLeapYear());
    }
}