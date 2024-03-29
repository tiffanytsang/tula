package com.amazonaws.demo.androidpubsubwebsocket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeScreenActivity extends Activity {

    double circumference1 = .351;
    double circumference2 = .345;
    double circumference3 = .307;
    double circumference4 = .254;
    double circumference5 = .245;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
    }

    public void checkHeartRate(View view) {
        Intent intent = new Intent(HomeScreenActivity.this, HeartRateActivity.class);
        intent.putExtra("circumference1", circumference1);
        intent.putExtra("circumference2", circumference2);
        intent.putExtra("circumference3", circumference3);
        intent.putExtra("circumference4", circumference4);
        intent.putExtra("circumference5", circumference5);
        startActivity(intent);
    }

    public void checkPressure(View view) {
        Intent intent = new Intent(HomeScreenActivity.this, PressureActivity.class);
        intent.putExtra("circumference1", circumference1);
        intent.putExtra("circumference2", circumference2);
        intent.putExtra("circumference3", circumference3);
        intent.putExtra("circumference4", circumference4);
        intent.putExtra("circumference5", circumference5);
        startActivity(intent);
    }

    public void adjustParameters(View view) {
        Intent intent = new Intent(HomeScreenActivity.this, ChangeParametersActivity.class);
        startActivity(intent);
        try {
            circumference1 = (Double) intent.getExtras().get("pressure1");
            circumference2 = (Double) intent.getExtras().get("pressure2");
            circumference3 = (Double) intent.getExtras().get("pressure3");
            circumference4 = (Double) intent.getExtras().get("pressure4");
            circumference5 = (Double) intent.getExtras().get("pressure5");
        } catch (Exception e) {
            circumference1 = .351;
            circumference2 = .345;
            circumference3 = .307;
            circumference4 = .254;
            circumference5 = .245;
        }
    }

    public void logout(View view) {
        Intent intent = new Intent(HomeScreenActivity.this, LoginActivity.class);
        intent.putExtra("circumference1", circumference1);
        intent.putExtra("circumference2", circumference2);
        intent.putExtra("circumference3", circumference3);
        intent.putExtra("circumference4", circumference4);
        intent.putExtra("circumference5", circumference5);
        startActivity(intent);
    }
}
