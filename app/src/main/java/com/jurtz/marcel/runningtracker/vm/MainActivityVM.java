package com.jurtz.marcel.runningtracker.vm;

import android.content.Context;

import com.jurtz.marcel.runningtracker.MainActivity;
import com.jurtz.marcel.runningtracker.R;

import java.util.Timer;

public class MainActivityVM {

    private Timer timer;

    public MainActivityVM() {
        timer = new Timer();
    }

    //public String timerText = timer.toString();
    public String timerText = "00:00:00";
    public String distanceText = "0.00 KM.";
}
