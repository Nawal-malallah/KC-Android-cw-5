package com.example.cw_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        EditText urname = findViewById(R.id.urname);
        EditText urage = findViewById(R.id.urage);


        Bundle b = getIntent().getExtras();

        String name = b.getString("gn");
        urname.setText(name);

        int age = b.getInt("ga");
        urage.setText(String.valueOf(age));
    }
}