package com.jurtz.marcel.runningtracker;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jurtz.marcel.runningtracker.databinding.ActivityHistoryBinding;
import com.jurtz.marcel.runningtracker.vm.HistoryActivityVM;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityHistoryBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_history);
        getSupportActionBar().hide();

        HistoryActivityVM viewModel = new HistoryActivityVM();
        binding.setViewmodel(viewModel);
    }
}
