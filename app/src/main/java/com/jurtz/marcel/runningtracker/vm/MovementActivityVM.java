package com.jurtz.marcel.runningtracker.vm;

import android.view.View;

import com.jurtz.marcel.runningtracker.ICustomActivity;

public class MovementActivityVM {

    ICustomActivity view;
    public MovementActivityVM(ICustomActivity view) {
        this.view = view;
    }

    public String title = "MOVE";
    public String timerText = "00:00:00";
    public String distanceText = "0.00 KM";

    public void onCmdStopClick(View v) {
        view.returnToPreviousActivity();
    }
}
