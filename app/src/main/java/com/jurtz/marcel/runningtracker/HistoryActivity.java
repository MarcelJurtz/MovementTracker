package com.jurtz.marcel.runningtracker;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jurtz.marcel.runningtracker.databinding.ActivityHistoryBinding;
import com.jurtz.marcel.runningtracker.vm.HistoryActivityVM;

public class HistoryActivity extends AppCompatActivity implements ICustomActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityHistoryBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_history);
        getSupportActionBar().hide();

        HistoryActivityVM viewModel = new HistoryActivityVM(this);
        binding.setViewmodel(viewModel);
    }

    @Override
    public void loadActivity(Class c, boolean finish) {
        Intent intent = new Intent(getApplicationContext(), c);
        if(finish) {
            finish();
        }
        startActivity(intent);
    }

    @Override
    public void loadActivity(Class c) {
        loadActivity(c, false);
    }

    @Override
    public void returnToPreviousActivity() {
        finish();
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }
}
