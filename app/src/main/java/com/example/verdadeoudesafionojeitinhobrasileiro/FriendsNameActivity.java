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
import android.widget.ListView;

public class FriendsNameActivity extends AppCompatActivity {

    Button btnAddPlayer;
    ImageButton btnBack, btnNext;

    private EditText txtFriendName;
    private ListView listFriendName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_name);

        btnAddPlayer = findViewById(R.id.btnAddPlayer);
        btnBack = findViewById(R.id.btnFriendsBack);
        btnNext = findViewById(R.id.btnFriendsDone);

        txtFriendName = findViewById(R.id.txtFriendName);
        listFriendName = findViewById(R.id.lvFriendName);


        btnAddPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrar();
                //programar essa porra de lista
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrar();
                FriendsNameActivity.this.finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrar();
                Intent i = new Intent(FriendsNameActivity.this, CategorySelectionActivity.class);
                startActivity(i);
            }
        });

    }

    private void vibrar() {
        Vibrator v = (Vibrator) FriendsNameActivity.this.getSystemService(Context.VIBRATOR_SERVICE);
// Vibrate for 30 milliseconds
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v.vibrate(VibrationEffect.createOneShot(15, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            //deprecated in API 26
            v.vibrate(15);
        }
    }
}
