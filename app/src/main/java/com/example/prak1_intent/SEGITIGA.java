package com.example.prak1_intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SEGITIGA extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        final EditText a = (EditText) findViewById(R.id.inputalas);
        final EditText t = (EditText) findViewById(R.id.inputtinggi);
        final Button HITUNG = (Button) findViewById(R.id.btnhitung);
        final TextView hasil = (TextView) findViewById(R.id.outputhasil);
        HITUNG.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String isialas = a.getText().toString();
                String isitinggi = t.getText().toString();
                double a = Double.parseDouble(isialas);
                double t = Double.parseDouble(isitinggi);
                double hasilakhir = (a * t)/2;
                String output = String.valueOf(hasilakhir);
                hasil.setText(output.toString());
            }
        });
    }
}
