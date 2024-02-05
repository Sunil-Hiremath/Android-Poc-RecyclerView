package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<ContactModal> arrContacts=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView;
        recyclerView=findViewById(R.id.recyclerContact);

        // first need to set the layout manager i.e, linear or grid or any other

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModal(R.drawable.c1,"Aman","554454"));
        arrContacts.add(new ContactModal(R.drawable.c2,"ajay","554454"));
        arrContacts.add(new ContactModal(R.drawable.c3,"ramesh","554454"));
        arrContacts.add(new ContactModal(R.drawable.c4,"ino","554454"));
        arrContacts.add(new ContactModal(R.drawable.c5,"jay","554454"));
        arrContacts.add(new ContactModal(R.drawable.c4,"yoho","554454"));
        arrContacts.add(new ContactModal(R.drawable.c2,"naruto","554454"));
        arrContacts.add(new ContactModal(R.drawable.c1,"akah","554454"));
        arrContacts.add(new ContactModal(R.drawable.contact,"akash","554454"));
        arrContacts.add(new ContactModal(R.drawable.c4,"raman","554454"));
        arrContacts.add(new ContactModal(R.drawable.c2,"tina","554454"));
        arrContacts.add(new ContactModal(R.drawable.c1,"tom","554454"));
        arrContacts.add(new ContactModal(R.drawable.c1,"jerry","554454"));
        arrContacts.add(new ContactModal(R.drawable.contact,"go","554454"));
        arrContacts.add(new ContactModal(R.drawable.c3,"ooty","554454"));
        arrContacts.add(new ContactModal(R.drawable.c4,"house","554454"));
        arrContacts.add(new ContactModal(R.drawable.c3,"hu","554454"));
        arrContacts.add(new ContactModal(R.drawable.c2,"ji","554454"));
        arrContacts.add(new ContactModal(R.drawable.contact,"ty","554454"));
        arrContacts.add(new ContactModal(R.drawable.c1,"po","554454"));

        // this class is called after setting the data above other wise called above the size it will send will be 0
        RecyclerContactAdapter adapter=new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);





    }
}