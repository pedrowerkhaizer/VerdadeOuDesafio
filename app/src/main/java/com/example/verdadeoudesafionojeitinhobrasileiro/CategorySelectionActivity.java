package com.example.verdadeoudesafionojeitinhobrasileiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageButton;

public class CategorySelectionActivity extends AppCompatActivity {

    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selection);

        btnBack = findViewById(R.id.btnCategoryBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrar();
                CategorySelectionActivity.this.finish();
            }
        });
    }

    private void vibrar() {
        Vibrator v = (Vibrator) CategorySelectionActivity.this.getSystemService(Context.VIBRATOR_SERVICE);
// Vibrate for 30 milliseconds
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v.vibrate(VibrationEffect.createOneShot(15, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            //deprecated in API 26
            v.vibrate(15);
        }
    }
}
