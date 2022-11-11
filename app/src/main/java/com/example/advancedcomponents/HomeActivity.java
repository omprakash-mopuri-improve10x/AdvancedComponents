package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        handleLuckyNumberButton();
        handleLocationButton();
        handleDateOfBirthButton();
        handleTeamButton();
        handleAddMembersButton();
        handleTeamListButton();
        handleContactButton();
    }

    public void handleLuckyNumberButton() {
        Button luckyNumberBtn = findViewById(R.id.lucky_number_btn);
        luckyNumberBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LuckyNumberActivity.class);
            startActivity(intent);
        });
    }

    public void handleLocationButton() {
        Button locationBtn = findViewById(R.id.location_btn);
        locationBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LocationActivity.class);
            startActivity(intent);
        });
    }

    public void handleDateOfBirthButton() {
        Button dateOfBirthBtn = findViewById(R.id.date_of_birth_btn);
        dateOfBirthBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, DateOfBirthActivity.class);
            startActivity(intent);
        });
    }

    public void handleTeamButton() {
        Button teamBtn = findViewById(R.id.team_btn);
        teamBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TeamActivity.class);
            startActivity(intent);
        });
    }

    public void handleTeamListButton() {
        Button teamListBtn = findViewById(R.id.team_list_btn);
        teamListBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TeamListActivity.class);
            startActivity(intent);
        });
    }

    public void handleAddMembersButton() {
        Button addMembersBtn = findViewById(R.id.add_members_btn);
        addMembersBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddMembersActivity.class);
            startActivity(intent);
        });
    }

    public void handleContactButton() {
        Button contactBtn = findViewById(R.id.contact_btn);
        contactBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ContactsActivity.class);
            startActivity(intent);
        });
    }
}