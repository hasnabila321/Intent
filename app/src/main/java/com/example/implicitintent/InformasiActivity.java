package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InformasiActivity extends AppCompatActivity {

    private TextView nama;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);

        nama = findViewById(R.id.nama);

        Bundle data = getIntent().getExtras();
        String namaAnda = data.getString("namaAnda");

        nama.setText(namaAnda);
    }
}