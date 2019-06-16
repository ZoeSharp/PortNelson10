package com.example.portnelson10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void nextPage(View view) {
        Intent randomIntent = new Intent(MainActivity.this, activity_homePage.class);
        startActivity(randomIntent);

    }
}
