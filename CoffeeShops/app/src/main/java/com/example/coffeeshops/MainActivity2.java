package com.example.coffeeshops;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<CoffeeShops> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        CoffeeShops coffee1 = new CoffeeShops("Arabica", "AlKout-Murouj-Salhiya","Iced Spanish Latte",R.drawable.img_2);
        CoffeeShops coffee2 = new CoffeeShops("Caf", "Shuwaikh-Gate Mall- Surra","Iced Shaken",R.drawable.img_3);
        CoffeeShops coffee3 = new CoffeeShops("Boost Cafe", "Kuwait City","Youthberry Ice Tea",R.drawable.img_5);
        CoffeeShops coffee4 = new CoffeeShops("Mukhcafe", "Muhboula","Iced Spanish Latte",R.drawable.img_6);
        CoffeeShops coffee5 = new CoffeeShops("Mug Coffee", "AlKout-Mangaf-Jahra","Cold Brew",R.drawable.img_7);
        CoffeeShops coffee6 = new CoffeeShops("Gravity", "Abu Halifah","White Mocha",R.drawable.img_8);
        CoffeeShops coffee7 = new CoffeeShops("Hawa Caffe", "Sharq- Eshbelia","Spanish Latte",R.drawable.img_9);
        CoffeeShops coffee8 = new CoffeeShops("Alpha Cafe", "Sharq & Shuwaikh","Alpha Latte",R.drawable.img_10);
        CoffeeShops coffee9 = new CoffeeShops("Vol.1", "Sharg & Shuwaikh","Cold Brew",R.drawable.img_11);
        CoffeeShops coffee10 = new CoffeeShops("THE BACKBURNER", "Sharq","Cold Brew",R.drawable.img_12);


        myList.add(coffee1);
        myList.add(coffee2);
        myList.add(coffee3);
        myList.add(coffee4);
        myList.add(coffee5);
        myList.add(coffee6);
        myList.add(coffee7);
        myList.add(coffee8);
        myList.add(coffee9);
        myList.add(coffee10);



        RecyclerView recycler = findViewById(R.id.rv1);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(myList, this);
        recycler.setAdapter(adapter);

    }
}