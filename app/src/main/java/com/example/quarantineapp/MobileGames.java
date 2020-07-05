package com.example.quarantineapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MobileGames extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobilegames);

        //button to go to house party
        Button button1 = findViewById(R.id.goToHouseParty);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MobileGames.this, HouseParty.class);
                startActivity(intent);
            }
        });

        //button to go to kahoot
        Button button2 = findViewById(R.id.goToKahoot);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MobileGames.this, Kahoot.class);
                startActivity(intent);
            }
        });

        //button to go to mariokart
        Button button3 = findViewById(R.id.goToMarioKart);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MobileGames.this, MarioKart.class);
                startActivity(intent);
            }
        });

        //button to go to minecraft
        Button button4 = findViewById(R.id.goToMinecraft);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MobileGames.this, Minecraft.class);
                startActivity(intent);
            }
        });

        //button to go to scrabble
        Button button5 = findViewById(R.id.goToScrabble);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MobileGames.this, Scrabble.class);
                startActivity(intent);
            }
        });

        //button to go to back
        Button button6 = findViewById(R.id.goToMainMenu);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MobileGames.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}
