package com.jurtz.marcel.runningtracker;

import android.content.Context;

public interface ICustomActivity {
    void loadActivity(Class c, boolean finish);
    void loadActivity(Class c);
    void returnToPreviousActivity();
    Context getContext();
}
