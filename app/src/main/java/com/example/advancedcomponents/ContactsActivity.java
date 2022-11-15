package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {

    public ArrayList<Contact> contactsList;
    public GridView contactsGv;
    public ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        getSupportActionBar().setTitle("Contacts");
        setupData();
        handleAddButton();
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
        Contact prakash = new Contact();
        prakash.name = "Omprakash";
        prakash.phoneNumber = "+91 9381979805";
        contactsList.add(prakash);
    }

    public void setupContactsListView() {
        contactsGv = findViewById(R.id.contacts_gv);
        contactsGv.setNumColumns(2);
        contactAdapter = new ContactAdapter(this, R.layout.contact_item, contactsList);
        contactsGv.setAdapter(contactAdapter);
    }

    public void handleAddButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText nameTxt = findViewById(R.id.name_txt);
            String name = nameTxt.getText().toString();
            EditText phoneNumberTxt = findViewById(R.id.phone_number_txt);
            String phoneNumber = phoneNumberTxt.getText().toString();
            Contact contact = new Contact();
            contact.name = name;
            contact.phoneNumber = phoneNumber;
            if (name.equals("") == false && phoneNumber.equals("") == false) {
                contactAdapter.add(contact);
                contactAdapter.notifyDataSetChanged();
            }
            nameTxt.setText("");
            phoneNumberTxt.setText("");
        });
    }
}