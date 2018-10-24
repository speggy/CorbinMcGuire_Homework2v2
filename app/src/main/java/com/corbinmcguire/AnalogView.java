package com.corbinmcguire.corbinmcguire_homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;


public class AnalogView extends AppCompatActivity {

    TimeDate timeDate = TimeDate.getTdInstance();

    /**
     * Launch new activity on analog button press.
     * @param view The view the buttons are on.
     */
    public void startAnalog(View view) {
        startActivity(new Intent(AnalogView.this, AnalogView.class));
    }

    /**
     * Launch new activity on digital button press.
     * @param view The view the buttons are on.
     */
    public void startDigital(View view) {
        startActivity(new Intent(AnalogView.this, DigitalView.class));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analog_view);




    }
}
