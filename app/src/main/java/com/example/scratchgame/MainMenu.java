package com.example.scratchgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

//        Button rename = (Button)findViewById(R.id.profileBtn);
//        rename.setText("RENAME");
    }

    public void profileUI(View view){
        Intent profileUI = new Intent(this, ProfileSelf.class);
        startActivity(profileUI);
    }

    public void rewardsUI(View view){
        Intent rewardsUI = new Intent(this, Rewards.class);
        startActivity(rewardsUI);
    }

    public void expUI(View view){
        Intent expUI = new Intent(this, Experience.class);
        startActivity(expUI);
    }

    public void progressUI(View view){
        Intent progressUI = new Intent(this, Progress.class);
        startActivity(progressUI);
    }

}