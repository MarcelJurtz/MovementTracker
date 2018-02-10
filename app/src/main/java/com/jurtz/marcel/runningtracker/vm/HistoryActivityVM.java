package com.jurtz.marcel.runningtracker.vm;

import com.jurtz.marcel.runningtracker.ICustomActivity;
import com.jurtz.marcel.runningtracker.database.AppDatabase;
import com.jurtz.marcel.runningtracker.model.Movement;

import java.util.List;

public class HistoryActivityVM {

    public HistoryActivityVM(ICustomActivity view) {
        this.view = view;
        movements = AppDatabase.getAppDatabase(view.getContext()).userDao().getAll();
    }

    private ICustomActivity view;
    public String title = "HISTORY";
    public List<Movement> movements;
}
