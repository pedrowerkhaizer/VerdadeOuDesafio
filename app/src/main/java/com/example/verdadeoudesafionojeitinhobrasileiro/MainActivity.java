package com.example.verdadeoudesafionojeitinhobrasileiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout llCasal, llAmigos;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llCasal = findViewById(R.id.llCasal);
        llCasal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrar();
               Intent i = new Intent(MainActivity.this, coupleNameActivity.class);
               startActivity(i);

            }
        });
        llAmigos = findViewById(R.id.llAmigos);
        llAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrar();
                Intent i = new Intent(MainActivity.this, FriendsNameActivity.class);
                startActivity(i);
            }
        });
    }

    private void vibrar() {
        Vibrator v = (Vibrator) MainActivity.this.getSystemService(Context.VIBRATOR_SERVICE);
// Vibrate for 30 milliseconds
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v.vibrate(VibrationEffect.createOneShot(15, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            //deprecated in API 26
            v.vibrate(15);
        }
    }
}
