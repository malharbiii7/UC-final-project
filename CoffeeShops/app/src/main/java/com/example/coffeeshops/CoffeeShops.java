package com.example.coffeeshops;

import android.location.Location;

import java.io.Serializable;

public class CoffeeShops implements Serializable {
    private String Name;
    private String Location;
    private String SignatureDrink;
    private int Img;

    public CoffeeShops(String name, String location, String signatureDrink, int img) {
        Name = name;
        Location = location;
        SignatureDrink = signatureDrink;
        Img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getSignatureDrink() {
        return SignatureDrink;
    }

    public void setSignatureDrink(String signatureDrink) {
        SignatureDrink = signatureDrink;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }
}
