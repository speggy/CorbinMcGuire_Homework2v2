package com.corbinmcguire.corbinmcguire_homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class DigitalView extends AnalogView {

    // Get the singleton instance of the model.
    TimeDate timeDate = TimeDate.getTdInstance();

    /**
     * On button click, the user-inputted time will be sent to the model to update.
     * @param view
     */
    public void submitTime(View view) {

        // Wire up widgets.
        EditText hourEditText = findViewById(R.id.hourEditText);
        EditText minuteEditText = findViewById(R.id.minuteEditText);
        EditText secondEditText = findViewById(R.id.secondEditText);

        // Update the model.
        timeDate.setHour(Integer.parseInt(hourEditText.getText().toString()));
        timeDate.setMinute(Integer.parseInt(minuteEditText.getText().toString()));
        timeDate.setSecond(Integer.parseInt(secondEditText.getText().toString()));

        // Output info to the log.
        Log.i("Hour ", hourEditText.getText().toString());
        Log.i("Minute ", minuteEditText.getText().toString());
        Log.i("Second ", secondEditText.getText().toString());
        Log.i("Time", timeDate.printTime());
    }


    /**
     * On button click, the user-inputted date will be sent to the model to update.
     * @param view
     */
    public void submitDate(View view) {

        // Wire up widgets.
        EditText monthEditText = findViewById(R.id.monthEditText);
        EditText dayEditText = findViewById(R.id.dayEditText);
        EditText yearEditText = findViewById(R.id.yearEditText);

        // Update the model.
        timeDate.setMonth(Integer.parseInt(monthEditText.getText().toString()));
        timeDate.setDay(Integer.parseInt(dayEditText.getText().toString()));
        timeDate.setYear(Integer.parseInt(yearEditText.getText().toString()));

        // Output info to the log.
        Log.i("Month", monthEditText.getText().toString());
        Log.i("Day", dayEditText.getText().toString());
        Log.i("Year", yearEditText.getText().toString());
        Log.i("Date", timeDate.printDate());
    }

    public void updateTime(){
        EditText hourEditText = (EditText) findViewById(R.id.hourEditText);
        EditText minuteEditText = (EditText) findViewById(R.id.minuteEditText);
        EditText secondEditText = (EditText) findViewById(R.id.secondEditText);

        hourEditText.setText(timeDate.getHour());
        minuteEditText.setText(timeDate.getMinute());
        secondEditText.setText((timeDate.getSecond()));
    }

    /**
     * Launch new activity on analog button press.
     * @param view The view the buttons are on.
     */
    public void startAnalog(View view) {
        startActivity(new Intent(DigitalView.this, AnalogView.class));
    }

    /**
     * Launch new activity on digital button press.
     * @param view The view the buttons are on.
     */
    public void startDigital(View view) {
        startActivity(new Intent(DigitalView.this, DigitalView.class));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_view);

        //updateTime();
    }
}
