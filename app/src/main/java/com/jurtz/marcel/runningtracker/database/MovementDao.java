package com.jurtz.marcel.runningtracker.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.jurtz.marcel.runningtracker.model.Movement;

import java.util.List;

@Dao
public interface MovementDao {
    @Query("SELECT * FROM movement")
    List<Movement> getAll();

    @Insert
    void Insert(Movement movement);

    @Delete
    void Delete(Movement movement);
}
