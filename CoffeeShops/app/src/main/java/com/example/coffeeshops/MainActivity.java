package com.example.coffeeshops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Email = findViewById(R.id.editTextTextEmailAddress);
        EditText Password = findViewById(R.id.editTextTextPassword);

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);

        Button calculate = findViewById(R.id.button);
        c = this;

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = Email.getText().toString();
                String b = Password.getText().toString();

                if (a.equals("") && b.equals("")) {
                    Toast.makeText(c, "Please Enter the Missing Information", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(intent);
                }
            }
        });
    }
}