package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        txtView2 = findViewById(R.id.txt2);
        txtView2.setText(R.string.SecondText);

        //Logging
        Log.i("Lifestyle", "onCreate() method invoked");

    }

    public void onPause() {
        super.onPause();
        Log.i("Lifestyle","onPause() invoked");
    }

    public void onStop() {
        super.onStop();
        Log.i("Lifestyle", "onStop() invoked");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("Lifestyle", "onDestroy() invoked");
    }

    public void onStart() {
        super.onStart();
        Log.i("Lifestyle", "onStart() invoked");
    }

    public void onResume() {
        super.onResume();
        Log.i("Lifestyle", "onResume() invoked");
    }

    public void onRestart() {
        super.onRestart();
        Log.i("Lifestyle", "onRestart() invoked");
    }
}