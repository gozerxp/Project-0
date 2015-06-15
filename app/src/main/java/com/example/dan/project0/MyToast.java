package com.example.dan.project0;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Dan on 6/14/15.
 */
public class MyToast {
    private Toast mAppToast;

    public void displayToast(View view, Context context) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        CharSequence text = "You clicked " + buttonText + "!";
        int duration = Toast.LENGTH_SHORT;

        if (mAppToast != null) {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(context, text, duration);
        mAppToast.show();

    }
}
