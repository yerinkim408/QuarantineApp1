package com.example.quarantineapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SomeSupplies extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.somesupplies);

        //button to go to telephone pictionary
        Button button1 = findViewById(R.id.goToTelephonePictionary);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SomeSupplies.this, TelephonePictionary.class);
                startActivity(intent);
            }
        });

        //button to go to back
        Button button2 = findViewById(R.id.goToMainMenu);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SomeSupplies.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}
