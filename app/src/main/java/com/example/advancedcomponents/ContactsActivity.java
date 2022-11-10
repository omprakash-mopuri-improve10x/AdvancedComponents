package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {

    public ArrayList<Contact> contactsList;
    public ListView contactsLV;
    public ArrayAdapter<Contact> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        getSupportActionBar().setTitle("Contacts");
        setupData();
        setupContactsListView();
    }

    public void setupData() {
        contactsList = new ArrayList<>();
        Contact vissu = new Contact();
        vissu.name = "Viswanath";
        vissu.phoneNumber = "+91 9000540052";
        contactsList.add(vissu);
        Contact renu = new Contact();
        renu.name = "Renuka";
        renu.phoneNumber = "+91 9886655979";
        contactsList.add(renu);
    }

    public void setupContactsListView() {
        contactsLV = findViewById(R.id.contacts_lv);
        arrayAdapter = new ArrayAdapter<Contact>(this, R.layout.contact_item, contactsList);
    }
}