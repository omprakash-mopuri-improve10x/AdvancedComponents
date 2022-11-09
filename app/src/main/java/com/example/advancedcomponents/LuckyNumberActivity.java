package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class LuckyNumberActivity extends AppCompatActivity {

    public ArrayList<Integer> luckyNumbersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        getSupportActionBar().setTitle("Lucky Number");
        setData();
        setUpLuckyNumber();
    }

    public void setData() {
        luckyNumbersList = new ArrayList<>();
        luckyNumbersList.add(1);
        luckyNumbersList.add(2);
        luckyNumbersList.add(3);
        luckyNumbersList.add(4);
        luckyNumbersList.add(5);
        luckyNumbersList.add(6);
        luckyNumbersList.add(7);
        luckyNumbersList.add(8);
        luckyNumbersList.add(9);
        luckyNumbersList.add(10);
    }

    public void setUpLuckyNumber() {
        Spinner luckyNumberSp = findViewById(R.id.lucky_number_sp);
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, R.layout.dropdown_item, luckyNumbersList);
        luckyNumberSp.setAdapter(arrayAdapter);
        luckyNumberSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(LuckyNumberActivity.this, "Lucky Number : " + luckyNumbersList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}