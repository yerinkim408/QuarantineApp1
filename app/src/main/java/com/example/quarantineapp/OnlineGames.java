package com.example.quarantineapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OnlineGames extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onlinegames);

        //button to go to club penguin
        Button button4 = findViewById(R.id.goToClubPenguin);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OnlineGames.this, ClubPenguin.class);
                startActivity(intent);
            }
        });

        //button to go to fake artist
        Button button5 = findViewById(R.id.goToFakeArtist);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OnlineGames.this, FakeArtist.class);
                startActivity(intent);
            }
        });

        //button to go to kahoot
        Button button6 = findViewById(R.id.goToKahoot);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OnlineGames.this, Kahoot.class);
                startActivity(intent);
            }
        });

        //button to go to minecraft
        Button button7 = findViewById(R.id.goToMinecraft);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OnlineGames.this, Minecraft.class);
                startActivity(intent);
            }
        });

        //button to go to monopoly
        Button button8 = findViewById(R.id.goToMonopoly);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OnlineGames.this, Monopoly.class);
                startActivity(intent);
            }
        });

        //button to go to pogo
        Button button9 = findViewById(R.id.goToPogo);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OnlineGames.this, Pogo.class);
                startActivity(intent);
            }
        });

        //button to go to skribblio
        Button button10 = findViewById(R.id.goToSkribblio);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OnlineGames.this, Skribblio.class);
                startActivity(intent);
            }
        });

        //button to go to back
        Button button11 = findViewById(R.id.goToMainMenu);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OnlineGames.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}
