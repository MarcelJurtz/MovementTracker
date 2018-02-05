package com.jurtz.marcel.runningtracker.vm;
import android.view.View;
import com.jurtz.marcel.runningtracker.HistoryActivity;
import com.jurtz.marcel.runningtracker.ICustomActivity;
import com.jurtz.marcel.runningtracker.SettingsActivity;

import java.util.Timer;

public class MainActivityVM {

    private Timer timer;
    private ICustomActivity view;

    public MainActivityVM(ICustomActivity view) {
        this.view = view;
        timer = new Timer();
    }

    //public String timerText = timer.toString();
    public String aggregationDescription = "2018";
    public String timerText = "00:00:00";
    public String distanceText = "0.00 KM";

    public void onCmdHistoryClick(View v) {
        view.loadActivity(HistoryActivity.class);
    }

    public void onCmdSettingsClick(View v) {
        view.loadActivity(SettingsActivity.class);
    }
}
