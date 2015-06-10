package com.example.dan.project0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Toast mAppToast;

    public void displayToast(View view) {
        Button button = (Button)view;
        String buttonText = button.getText().toString();
        Context context = getApplicationContext();
        CharSequence text = "You clicked " + buttonText + "!";
        int duration = Toast.LENGTH_SHORT;

        if(mAppToast !=null) {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(context,text, duration);
        mAppToast.show();

    }
}
