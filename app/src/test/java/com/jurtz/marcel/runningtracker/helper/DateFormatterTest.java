package com.jurtz.marcel.runningtracker.helper;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class DateFormatterTest {
    @Test
    public void getFormattedDate_ddMMyyyy() throws Exception {
        Date date = new GregorianCalendar(2018, 0, 15).getTime();
        String expected = "15.01.2018";
        String actual = DateFormatter.getFormattedDate(DateFormatter.PATTERN_DDMMYYY, date);
        assertEquals(expected, actual);
    }

    @Test
    public void getFormattedDate_yyyyMMdd() throws Exception {
        Date date = new GregorianCalendar(2018, 0, 15).getTime();
        String expected = "2018-01-15";
        String actual = DateFormatter.getFormattedDate(DateFormatter.PATTERN_YYYYMMDD, date);
        assertEquals(expected, actual);
    }
}