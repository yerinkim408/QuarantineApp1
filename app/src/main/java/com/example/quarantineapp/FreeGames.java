package com.example.quarantineapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FreeGames extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.freegames);

        //club penguin button
        Button button1 = findViewById(R.id.goToClubPenguin);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(FreeGames.this, ClubPenguin.class);
                startActivity(intent2);
            }
        });

        //fake artist button
        Button button2 = findViewById(R.id.goToFakeArtist);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(FreeGames.this, FakeArtist.class);
                startActivity(intent2);
            }
        });

        //kahoot button
        Button button3 = findViewById(R.id.goToKahoot);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(FreeGames.this, Kahoot.class);
                startActivity(intent2);
            }
        });

        //mariokart button
        Button button4 = findViewById(R.id.goToMarioKart);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(FreeGames.this, MarioKart.class);
                startActivity(intent2);
            }
        });

        //monopoly button
        Button button5 = findViewById(R.id.goToMonopoly);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(FreeGames.this, Monopoly.class);
                startActivity(intent2);
            }
        });

        //pogo button
        Button button6 = findViewById(R.id.goToPogo);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(FreeGames.this, Pogo.class);
                startActivity(intent2);
            }
        });

        //scrabble button
        Button button7 = findViewById(R.id.goToScrabble);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(FreeGames.this, Scrabble.class);
                startActivity(intent2);
            }
        });

        //skribblio button
        Button button8 = findViewById(R.id.goToSkribblio);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(FreeGames.this, Skribblio.class);
                startActivity(intent2);
            }
        });

        //scrabble button
        Button button9 = findViewById(R.id.goToTelephonePictionary);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(FreeGames.this, TelephonePictionary.class);
                startActivity(intent2);
            }
        });

        //button to go to back
        Button button10 = findViewById(R.id.goToMainMenu);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FreeGames.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}
