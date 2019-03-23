package com.example.assignment_1;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.time.Year;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText date;
    private EditText f_name;
    private EditText l_name;
    private Button Register;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date = findViewById(R.id.date);
        Register = findViewById(R.id.Reg);
        f_name = findViewById(R.id.firsname);
        l_name = findViewById(R.id.lastname);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                final int year = calendar.get(Calendar.YEAR);
                final int month = calendar.get(Calendar.MONTH);
                final int day = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        date.setText(day+"-"+(month+1)+"-"+year);
                    }
                },year,month,day);
                datePickerDialog.show(); }});

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = f_name.getText().toString();
                String lname = l_name.getText().toString();
                String date_1 = date.getText().toString();


                final Intent data = new Intent(MainActivity.this,data.class);
                Bundle bundle = new Bundle();
                bundle.putString("fname",fname);
                bundle.putString("lname",lname);
                bundle.putString("date",date_1);
                data.putExtras(bundle);
                startActivity(data);
            }
        });

    }
}
