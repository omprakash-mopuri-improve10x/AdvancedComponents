package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class DateOfBirthActivity extends AppCompatActivity {

    public ArrayList<Integer> datesList;
    public ArrayList<String> monthsList;
    public ArrayList<Integer> yearsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_of_birth);
        getSupportActionBar().setTitle("Date Of Birth");
        setDataFromDates();
        setDataFromMonths();
        setDataFromYears();
        setUpDate();
        setUpMonth();
        setUpYear();
    }

    public void setDataFromDates() {
        datesList = new ArrayList<>();
        datesList.add(1);
        datesList.add(2);
        datesList.add(3);
        datesList.add(4);
        datesList.add(5);
        datesList.add(6);
        datesList.add(7);
        datesList.add(8);
        datesList.add(9);
        datesList.add(10);
        datesList.add(11);
        datesList.add(12);
        datesList.add(13);
        datesList.add(14);
        datesList.add(15);
        datesList.add(16);
        datesList.add(17);
        datesList.add(18);
        datesList.add(19);
        datesList.add(20);
        datesList.add(21);
        datesList.add(22);
        datesList.add(23);
        datesList.add(24);
        datesList.add(25);
        datesList.add(26);
        datesList.add(27);
        datesList.add(28);
        datesList.add(29);
        datesList.add(30);
        datesList.add(31);
    }

    public void setDataFromMonths() {
        monthsList = new ArrayList<>();
        monthsList.add("Jan");
        monthsList.add("Feb");
        monthsList.add("Mar");
        monthsList.add("Apr");
        monthsList.add("May");
        monthsList.add("Jun");
        monthsList.add("Jul");
        monthsList.add("Aug");
        monthsList.add("Sep");
        monthsList.add("Oct");
        monthsList.add("Nov");
        monthsList.add("Dec");
    }

    public void setDataFromYears() {
        yearsList = new ArrayList<>();
        yearsList.add(1961);
        yearsList.add(1962);
        yearsList.add(1963);
        yearsList.add(1964);
        yearsList.add(1965);
        yearsList.add(1966);
        yearsList.add(1967);
        yearsList.add(1968);
        yearsList.add(1969);
        yearsList.add(1970);
        yearsList.add(1971);
        yearsList.add(1972);
        yearsList.add(1973);
        yearsList.add(1974);
        yearsList.add(1975);
        yearsList.add(1976);
        yearsList.add(1977);
        yearsList.add(1978);
        yearsList.add(1979);
        yearsList.add(1980);
        yearsList.add(1981);
        yearsList.add(1982);
        yearsList.add(1983);
        yearsList.add(1984);
        yearsList.add(1985);
        yearsList.add(1986);
        yearsList.add(1987);
        yearsList.add(1988);
        yearsList.add(1989);
        yearsList.add(1990);
        yearsList.add(1991);
        yearsList.add(1992);
        yearsList.add(1993);
        yearsList.add(1994);
        yearsList.add(1995);
        yearsList.add(1996);
        yearsList.add(1997);
        yearsList.add(1998);
        yearsList.add(1999);
        yearsList.add(2000);
        yearsList.add(2001);
        yearsList.add(2002);
        yearsList.add(2003);
        yearsList.add(2004);
        yearsList.add(2005);
        yearsList.add(2006);
        yearsList.add(2007);
        yearsList.add(2008);
        yearsList.add(2009);
        yearsList.add(2010);
        yearsList.add(2011);
        yearsList.add(2012);
        yearsList.add(2013);
        yearsList.add(2014);
        yearsList.add(2015);
        yearsList.add(2016);
        yearsList.add(2017);
        yearsList.add(2018);
        yearsList.add(2019);
        yearsList.add(2020);
        yearsList.add(2021);
        yearsList.add(2022);
    }

    public void setUpDate() {
        Spinner dateSp = findViewById(R.id.date_sp);
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, datesList);
        dateSp.setAdapter(arrayAdapter);
        dateSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "Date : " + datesList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setUpMonth() {
        Spinner monthSp = findViewById(R.id.month_sp);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.dropdown_months_item, monthsList);
        monthSp.setAdapter(arrayAdapter);
        monthSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "Month : " + monthsList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void setUpYear() {
        Spinner yearSp = findViewById(R.id.year_sp);
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, yearsList);
        yearSp.setAdapter(arrayAdapter);
        yearSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(DateOfBirthActivity.this, "Year : " + yearsList.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}