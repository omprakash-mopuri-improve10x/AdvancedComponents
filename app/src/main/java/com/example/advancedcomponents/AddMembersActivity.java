package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class AddMembersActivity extends AppCompatActivity {

    public ArrayList<String> teamsList;
    public ArrayList<String> allMembersList;
    public ArrayList<String> teamAMembersList;
    public ArrayList<String> teamBMembersList;
    public ArrayAdapter<String> selectTeamAdapter;
    public ArrayAdapter<String> allMembersAdapter;
    public ArrayAdapter<String> teamAAdapter;
    public ArrayAdapter<String> teamBAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_members);
        getSupportActionBar().setTitle("Add Members");
        setDataForTeams();
        setDataForAllMembers();
        setDataForTeamA();
        setDataForTeamB();
        handleAddButton();
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

    public void handleAddButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText nameTxt = findViewById(R.id.name_txt);
            String name = nameTxt.getText().toString();
        });
    }

    public void setUpSelectTeam() {
        Spinner selectTeamSp = findViewById(R.id.select_team_sp);
        selectTeamAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamsList);
        selectTeamSp.setAdapter(selectTeamAdapter);
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
        allMembersAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, allMembersList);
        allMembersSp.setAdapter(allMembersAdapter);
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
        teamAAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamAMembersList);
        teamASp.setAdapter(teamAAdapter);
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
        teamBAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamBMembersList);
        teamBSp.setAdapter(teamBAdapter);
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