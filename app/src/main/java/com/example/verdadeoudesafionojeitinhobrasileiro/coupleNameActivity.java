package com.example.verdadeoudesafionojeitinhobrasileiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class coupleNameActivity extends AppCompatActivity {

    EditText txtP1, txtP2;
    Button btnNext;
    ImageButton btnBack, imgbtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couple_name);

        txtP1 = findViewById(R.id.txtParceirx1);
        txtP2 = findViewById(R.id.txtParceirx2);
        btnNext = findViewById(R.id.btnSelectCategory);
        btnBack = findViewById(R.id.btnCoupleBack);
        imgbtnNext = findViewById(R.id.btnCoupleDone);

        txtP1.setSingleLine();
        txtP2.setSingleLine();

        imgbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrar();
                Intent i = new Intent(coupleNameActivity.this, CategorySelectionActivity.class);
                startActivity(i);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrar();
                Intent i = new Intent(coupleNameActivity.this, CategorySelectionActivity.class);
                startActivity(i);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrar();
                coupleNameActivity.this.finish();
            }
        });

    }

    private void vibrar() {
        Vibrator v = (Vibrator) coupleNameActivity.this.getSystemService(Context.VIBRATOR_SERVICE);
// Vibrate for 30 milliseconds
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v.vibrate(VibrationEffect.createOneShot(15, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            //deprecated in API 26
            v.vibrate(15);
        }
    }
}
