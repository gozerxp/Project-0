package com.example.dan.project0;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    public theToast toaster;

    public void displayToast(View view) {
        toaster.displayToast(view, getApplicationContext());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toaster = new theToast();
        setContentView(R.layout.activity_main);
    }

}

