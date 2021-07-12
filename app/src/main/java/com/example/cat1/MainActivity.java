package com.example.cat1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int SPLASH_TIME = 1000;
        new Handler().postDelayed(() -> startActivity(new Intent(getApplicationContext(),AuthenticationActivity.class)), SPLASH_TIME);

    }


}