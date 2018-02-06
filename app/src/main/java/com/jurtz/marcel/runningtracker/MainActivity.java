package com.jurtz.marcel.runningtracker;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jurtz.marcel.runningtracker.databinding.ActivityMainBinding;
import com.jurtz.marcel.runningtracker.vm.MainActivityVM;

public class MainActivity extends AppCompatActivity implements ICustomActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        getSupportActionBar().hide();

        MainActivityVM viewModel = new MainActivityVM(this);
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
