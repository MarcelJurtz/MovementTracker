package com.jurtz.marcel.runningtracker.vm;

import android.view.View;

import com.jurtz.marcel.runningtracker.ICustomActivity;
import com.jurtz.marcel.runningtracker.MovementActivity;
import com.jurtz.marcel.runningtracker.database.AppDatabase;
import com.jurtz.marcel.runningtracker.model.Movement;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MovementActivityVM {

    ICustomActivity view;
    private Date movementStarted;
    public MovementActivityVM(ICustomActivity view) {
        this.view = view;
        movementStarted = new Date();
    }

    public String title = "MOVE";
    public String timerText = "00:00:00";
    public String distanceText = "0.00 KM";

    public void onCmdStopClick(View v) {
        Movement movement = new Movement();
        movement.timeStamp = movementStarted;
        movement.distance = 1500;

        long differenceInMillis = new Date().getTime() - movementStarted.getTime();
        long seconds = differenceInMillis / 1000;
        long hours = TimeUnit.SECONDS.toHours(seconds);
        seconds -= TimeUnit.HOURS.toSeconds (hours);
        long minutes = TimeUnit.SECONDS.toMinutes (seconds);
        seconds -= TimeUnit.MINUTES.toSeconds (minutes);

        movement.durationSec = (int)seconds;
        movement.durationMin = (int)minutes;
        movement.durationHour = (int)hours;

        AppDatabase.getAppDatabase(view.getContext()).userDao().Insert(movement);

        view.returnToPreviousActivity();
    }
}
