package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {
    EditText Angka1, Angka2;
    Button btnPlus, btnMinus, btnTimes, btnBagi;
    TextView txtHasil;
    double angkaSatu, angkaDua, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Angka1 = (EditText) findViewById(R.id.Angka1);
        Angka2 = (EditText) findViewById(R.id.Angka2);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnTimes = (Button) findViewById(R.id.btnTimes);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angkaSatu =Integer.parseInt(Angka1.getText().toString());
                int angkaDua = Integer.parseInt(Angka2.getText().toString());
                int hasil = angkaSatu + angkaDua;
                txtHasil.setText(String.valueOf(hasil));
                Toast.makeText(getApplicationContext(), "Hasil :" + hasil, Toast.LENGTH_SHORT).show();
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angkaSatu =Integer.parseInt(Angka1.getText().toString());
                int angkaDua = Integer.parseInt(Angka2.getText().toString());
                int hasil = angkaSatu - angkaDua;
                txtHasil.setText(String.valueOf(hasil));
                Toast.makeText(getApplicationContext(), "Hasil :" + hasil, Toast.LENGTH_SHORT).show();

            }
        });
        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angkaSatu =Integer.parseInt(Angka1.getText().toString());
                int angkaDua = Integer.parseInt(Angka2.getText().toString());
                int hasil = angkaSatu * angkaDua;
                txtHasil.setText(String.valueOf(hasil));
                Toast.makeText(getApplicationContext(), "Hasil :" + hasil, Toast.LENGTH_SHORT).show();
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angkaSatu = Integer.parseInt(Angka1.getText().toString());
                int angkaDua = Integer.parseInt(Angka2.getText().toString());
                hasil = angkaSatu / angkaDua;
                txtHasil.setText(String.valueOf(hasil));
                Toast.makeText(getApplicationContext(), "Hasil : "+ new DecimalFormat("##.##").format(hasil), Toast.LENGTH_SHORT).show();
            }
        });


    }
}