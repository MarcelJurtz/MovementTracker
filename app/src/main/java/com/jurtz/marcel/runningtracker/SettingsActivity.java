package com.jurtz.marcel.runningtracker;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jurtz.marcel.runningtracker.databinding.ActivitySettingsBinding;
import com.jurtz.marcel.runningtracker.vm.SettingsActivityVM;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySettingsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_settings);
        getSupportActionBar().hide();

        SettingsActivityVM viewModel = new SettingsActivityVM();
        binding.setViewmodel(viewModel);
    }
}
