package com.jurtz.marcel.runningtracker.helper;

import com.jurtz.marcel.runningtracker.model.Movement;

public class TimeFormatter {
    public static String getFormattedTime(int totalSeconds) {
        int hours;
        int minutes;
        int seconds;

        hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600) / 60;
        seconds = totalSeconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static String getFormattedTime(Movement movement) {
        return String.format("%02d:%02d:%02d", movement.durationHour, movement.durationMin, movement.durationSec);
    }
}
