package com.example.assignment_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        TextView name = findViewById(R.id.name);
        TextView birth = findViewById(R.id.birth);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String fmame = bundle.getString("fname");
        String lname = bundle.getString("lname");
        String date = bundle.getString("date");

        name.setText(fmame + " " + lname);
        birth.setText(date);



    }
}
