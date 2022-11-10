package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {

    public ListView namesLv;
    public ArrayList<String> namesList;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        getSupportActionBar().setTitle("Team List");
        setData();
        setupNames();
        handleAddButton();
    }

    public void setData() {
        namesList = new ArrayList<>();
        namesList.add("Viswanath");
        namesList.add("Renuka");
    }

    public void setupNames() {
        namesLv = findViewById(R.id.names_lv);
        arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, namesList);
        namesLv.setAdapter(arrayAdapter);
    }

    public void handleAddButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText nameTxt = findViewById(R.id.name_txt);
            String name = nameTxt.getText().toString();
            if (name.equals("") == false) {
                arrayAdapter.add(name);
                arrayAdapter.notifyDataSetChanged();
            }
            nameTxt.setText("");
        });
    }
}