package com.example.cw_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText en = findViewById(R.id.en);
        EditText ea = findViewById(R.id.ea);


        Button enterB = findViewById(R.id.button);

        enterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String enn = en.getText().toString();
                int eaa = Integer.parseInt(ea.getText().toString());

                Intent info = new Intent(MainActivity.this , screen2.class);

                info.putExtra("gn" ,enn);
                info.putExtra("ga" ,eaa);

                startActivity(info);
            }
        });

    }
}