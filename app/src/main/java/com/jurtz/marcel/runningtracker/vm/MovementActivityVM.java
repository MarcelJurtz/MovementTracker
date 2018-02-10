package com.jurtz.marcel.runningtracker.vm;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;
import android.view.View;

import com.jurtz.marcel.runningtracker.BR;
import com.jurtz.marcel.runningtracker.ICustomActivity;
import com.jurtz.marcel.runningtracker.database.AppDatabase;
import com.jurtz.marcel.runningtracker.helper.TimeFormatter;
import com.jurtz.marcel.runningtracker.model.Movement;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import android.os.Handler;

public class MovementActivityVM implements Observable {

    public MovementActivityVM(ICustomActivity view) {
        this.view = view;
        totalSeconds = 0;
        handler = new Handler();
        timerText = "00:00:00";
        distanceText = "0.00 KM";
        startMovement();
    }

    private ICustomActivity view;
    private Date movementStartedTimestamp;
    private Handler handler;
    private PropertyChangeRegistry registry = new PropertyChangeRegistry();

    //region ViewModel Properties & Overrides
    private int totalSeconds;

    private String timerText;
    @Bindable
    public String getTimerText() {
        return timerText;
    }
    private void setTimerText(String timerText) {
        this.timerText = timerText;
        registry.notifyChange(this, BR.timerText);
    }

    private String distanceText;
    @Bindable
    public String getDistanceText() {
        return distanceText;
    }
    private void setDistanceText(String distanceText) {
        this.distanceText = distanceText;
        registry.notifyChange(this, BR.distanceText);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback) {
        registry.add(onPropertyChangedCallback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback) {
        registry.remove(onPropertyChangedCallback);
    }
    //endregion

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            setTimerText(TimeFormatter.getFormattedTime(++totalSeconds));
            handler.postDelayed(runnable, 1000);
        }
    };

    private void startMovement() {
        movementStartedTimestamp = new Date();
        handler.postDelayed(runnable, 1000);
    }

    private void stopMovement() {
        // TODO TEST FOR DATABASE
        Movement movement = new Movement();
        movement.timeStamp = movementStartedTimestamp;
        movement.distance = 1500;

        long differenceInMillis = new Date().getTime() - movementStartedTimestamp.getTime();
        long seconds = differenceInMillis / 1000;
        long hours = TimeUnit.SECONDS.toHours(seconds);
        seconds -= TimeUnit.HOURS.toSeconds (hours);
        long minutes = TimeUnit.SECONDS.toMinutes (seconds);
        seconds -= TimeUnit.MINUTES.toSeconds (minutes);

        movement.durationSec = (int)seconds;
        movement.durationMin = (int)minutes;
        movement.durationHour = (int)hours;

        AppDatabase.getAppDatabase(view.getContext()).userDao().Insert(movement);
    }

    public void onCmdStopClick(View v) {
        stopMovement();
        view.returnToPreviousActivity();
    }


}
