package com.corbinmcguire.corbinmcguire_homework2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //TODO Test if you can create a single TimeDate object and pass it between activities.
    //TimeDate timeDate = new timeDate();

    /**
     * Launch new activity on analog button press.
     * @param view The view the buttons are on.
     */
    public void startAnalog(View view) {
        startActivity(new Intent(MainActivity.this, AnalogView.class));
    }

    /**
     * Launch new activity on digital button press.
     * @param view The view the buttons are on.
     */
    public void startDigital(View view) {
        startActivity(new Intent(MainActivity.this, DigitalView.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Welcome! Please select a clock to view.",
                Toast.LENGTH_LONG).show();
    }

}
