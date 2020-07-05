package com.example.quarantineapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Monopoly extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onlinemonopoly);

        Button button1 = findViewById(R.id.goToMainMenu);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(Monopoly.this, MainMenu.class);
                startActivity(intent2);
            }
        });
    }
}
