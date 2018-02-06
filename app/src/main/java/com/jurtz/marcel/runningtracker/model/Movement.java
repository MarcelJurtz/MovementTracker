package com.jurtz.marcel.runningtracker.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import java.util.Date;

@Entity(tableName = "movement")
public class Movement {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "timestamp")
    public Date timeStamp;
    @ColumnInfo(name = "duration_hour")
    public int durationHour;
    @ColumnInfo(name = "duration_min")
    public int durationMin;
    @ColumnInfo(name = "duration_sec")
    public int durationSec;
    @ColumnInfo(name = "distance")
    public int distance;
}
