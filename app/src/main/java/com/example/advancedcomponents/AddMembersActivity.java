package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class AddMembersActivity extends AppCompatActivity {

    public ArrayList<String> teamsList;
    public ArrayList<String> allMembersList;
    public ArrayList<String> teamAMembersList;
    public ArrayList<String> teamBMembersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_members);
        getSupportActionBar().setTitle("Add Members");
        setDataForTeams();
        setDataForAllMembers();
        setDataForTeamA();
        setDataForTeamB();
        setUpSelectTeam();
        setUpAllMembers();
        setUpTeamA();
        setUpTeamB();
    }

    public void setDataForTeams() {
        teamsList = new ArrayList<>();
        teamsList.add("Team A");
        teamsList.add("Team B");
    }

    public void setDataForAllMembers() {
        allMembersList = new ArrayList<>();
        allMembersList.add("Viswanath");
        allMembersList.add("Renuka");
    }

    public void setDataForTeamA() {
     teamAMembersList = new ArrayList<>();
     teamAMembersList.add("Viswanath");
     teamAMembersList.add("Renuka");
    }

    public void setDataForTeamB() {
        teamBMembersList = new ArrayList<>();
        teamBMembersList.add("Viswanath");
        teamBMembersList.add("Renuka");
    }

    public void setUpSelectTeam() {
        Spinner selectTeamSp = findViewById(R.id.select_team_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamsList);
        selectTeamSp.setAdapter(arrayAdapter);
        selectTeamSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this, " Selected Team : " + teamsList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setUpAllMembers() {
        Spinner allMembersSp = findViewById(R.id.all_members_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, allMembersList);
        allMembersSp.setAdapter(arrayAdapter);
        allMembersSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this, "Select : " + allMembersList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setUpTeamA() {
        Spinner teamASp = findViewById(R.id.teama_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamAMembersList);
        teamASp.setAdapter(arrayAdapter);
        teamASp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this, "Select : " + teamAMembersList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setUpTeamB() {
        Spinner teamBSp = findViewById(R.id.teamB_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamBMembersList);
        teamBSp.setAdapter(arrayAdapter);
        teamBSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AddMembersActivity.this, "Select : " + teamBMembersList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}