package com.example.coffeeshops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView name = findViewById(R.id.Name);
        TextView location = findViewById(R.id.Location);
        ImageView img = findViewById(R.id.Img);
        TextView signature = findViewById(R.id.SignatureDrink);

        Bundle bundle = getIntent().getExtras();

        CoffeeShops sendcs = (CoffeeShops) bundle.getSerializable("coffeeshops");

        name.setText(sendcs.getName());
        location.setText(sendcs.getLocation());
        signature.setText(sendcs.getSignatureDrink());
        img.setImageResource(sendcs.getImg());
    }
}