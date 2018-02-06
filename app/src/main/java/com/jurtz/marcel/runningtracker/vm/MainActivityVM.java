package com.jurtz.marcel.runningtracker.vm;
import android.view.View;
import com.jurtz.marcel.runningtracker.HistoryActivity;
import com.jurtz.marcel.runningtracker.ICustomActivity;
import com.jurtz.marcel.runningtracker.MovementActivity;
import com.jurtz.marcel.runningtracker.SettingsActivity;

import java.util.Timer;

public class MainActivityVM {

    private ICustomActivity view;

    public MainActivityVM(ICustomActivity view) {
        this.view = view;
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

    public void onCmdRunClick(View v) {
        view.loadActivity(MovementActivity.class);
    }
}
