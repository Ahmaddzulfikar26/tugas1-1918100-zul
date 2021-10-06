package com.example.prak1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BIODATA(View view) {
        Intent a = new Intent(MainActivity.this, BIODATA.class);
        startActivity(a);
    }
    public void SEGITIGA (View View) {
        Intent b = new Intent (MainActivity.this, SEGITIGA.class);
        startActivity(b);
    }
    }