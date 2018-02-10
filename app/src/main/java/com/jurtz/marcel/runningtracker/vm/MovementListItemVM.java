package com.jurtz.marcel.runningtracker.vm;

import android.databinding.Bindable;

import com.jurtz.marcel.runningtracker.BR;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;

public class MovementListItemVM implements Observable {

    private PropertyChangeRegistry registry = new PropertyChangeRegistry();

    @Bindable
    private String formattedTimestamp;

    @Bindable
    private String formattedDetails;

    public String getFormattedTimestamp() {
        return formattedTimestamp;
    }

    public String getFormattedDetails() {
        return formattedDetails;
    }

    public void setFormattedTimestamp(String timeStamp) {
        formattedTimestamp = timeStamp;
        registry.notifyChange(this,BR.formattedTimestamp);
    }

    public void setFormattedDetails(String details) {
        formattedDetails = details;
        registry.notifyChange(this, BR.formattedDetails);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback) {
        registry.add(onPropertyChangedCallback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback) {
        registry.remove(onPropertyChangedCallback);
    }
}
