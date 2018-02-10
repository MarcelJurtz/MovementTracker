package com.jurtz.marcel.runningtracker.helper;

import com.jurtz.marcel.runningtracker.model.Movement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public static String getFormattedDate(String pattern, Date date) {
        return new SimpleDateFormat(pattern).format(date);
    }

    public static final String PATTERN_DDMMYYY = "dd.MM.yyyy";
    public static final String PATTERN_YYYYMMDD = "yyyy-MM-dd";
}
