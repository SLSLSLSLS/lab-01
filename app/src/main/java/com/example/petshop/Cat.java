package com.example.petshop;

import android.provider.ContactsContract;

import java.util.Date;

public class Cat extends Pet implements Pettable {

    public Cat(String name) {
        super(name);
    }
    public Cat(String name, Date birthday) {
        super(name,birthday);
    }

    @Override
    public String speak() {
        return "meow"; // Cats meow
    }

    @Override
    public void pet(){}
}
