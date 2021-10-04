package com.example.prak1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BIODATA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        final EditText nama =
                (EditText)findViewById(R.id.inputnama);
        final EditText nim =
                (EditText)findViewById(R.id.inputnim);
        final EditText jurusan =
                (EditText)findViewById(R.id.inputjurusan);
        final EditText angkatan =
                (EditText)findViewById(R.id.inputangkatan);

        final TextView nama_t =
                (TextView)findViewById(R.id.outputnama);
        final TextView nim_t =
                (TextView)findViewById(R.id.outputnim);
        final TextView jurusan_t =
                (TextView)findViewById(R.id.outputjurusan);
        final TextView angkatan_t =
                (TextView)findViewById(R.id.outputangkatan);

        final Button tampil = (Button)findViewById(R.id.btntampil);

        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nama1 = nama.getText().toString();
                String nim1 = nim.getText().toString();
                String jurusan1 = jurusan.getText().toString();
                String angkatan1 = angkatan.getText().toString();

                nama_t.setText(nama1);
                nim_t.setText(nim1);
                jurusan_t.setText(jurusan1);
                angkatan_t.setText(angkatan1);
            }
        });

    }
}