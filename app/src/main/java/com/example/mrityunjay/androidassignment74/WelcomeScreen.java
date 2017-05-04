package com.example.mrityunjay.androidassignment74;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;




public class WelcomeScreen extends AppCompatActivity{

    TextView welcomeMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        welcomeMsg = (TextView) findViewById(R.id.welcomeName);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            welcomeMsg.setTextSize(25.00f);
            welcomeMsg.setText("Welcome " + bundle.getString(MainActivity.BUNDLE_KEY_NAME));
        }
    }
}