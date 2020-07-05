package com.example.quarantineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button to go to the main menu of game categories
        Button button = findViewById(R.id.goToMainMenu);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);
            }
        });

        //random generator button
        //Button randombutton = findViewById(R.id.goToRandomGen);
        //create list of games/activities each assigned to a number
        //get random number
        //according to which number is picked, go to certain page

    }

}
