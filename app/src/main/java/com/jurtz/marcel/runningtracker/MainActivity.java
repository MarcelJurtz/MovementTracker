package com.jurtz.marcel.runningtracker;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jurtz.marcel.runningtracker.databinding.ActivityMainBinding;
import com.jurtz.marcel.runningtracker.vm.MainActivityVM;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityVM viewModel = new MainActivityVM();
        binding.setViewmodel(viewModel);

    }
}
