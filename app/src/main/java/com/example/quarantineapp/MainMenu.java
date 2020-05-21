package com.example.quarantineapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        //online games button
        Button button1 = findViewById(R.id.goToOnlineGames);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(MainMenu.this, OnlineGames.class);
                startActivity(intent2);
            }
        });

        //mobile games button
        Button button2 = findViewById(R.id.goToMobileGames);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent(MainMenu.this, MobileGames.class);
                startActivity(intent3);
            }
        });

        //some supplies button
        Button button3 = findViewById(R.id.goToSomeSupplies);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent4 = new Intent(MainMenu.this, SomeSupplies.class);
                startActivity(intent4);
            }
        });
    }

}
