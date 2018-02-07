package com.jurtz.marcel.runningtracker.helper;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeFormatterTest {
    int seconds;

    @Test
    public void getFormattedTime_000000() throws Exception {
        seconds = 0;

        String expected = "00:00:00";
        String actual = TimeFormatter.getFormattedTime(seconds);

        assertEquals(expected, actual);
    }

    @Test
    public void getFormattedTime_000059() throws Exception {
        seconds = 59;

        String expected = "00:00:59";
        String actual = TimeFormatter.getFormattedTime(seconds);

        assertEquals(expected, actual);
    }


    @Test
    public void getFormattedTime_010000() throws Exception {
        seconds = 3600;

        String expected = "01:00:00";
        String actual = TimeFormatter.getFormattedTime(seconds);

        assertEquals(expected, actual);
    }

    @Test
    public void getFormattedTime_012345() throws Exception {
        seconds = 3600 + 23 * 60 + 45;


        String expected = "01:23:45";
        String actual = TimeFormatter.getFormattedTime(seconds);

        assertEquals(expected, actual);
    }
}