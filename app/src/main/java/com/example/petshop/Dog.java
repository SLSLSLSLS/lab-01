package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable {

    public Dog(String name) {
        super(name);
    }
    public Dog(String name, Date birthday) {
        super(name,birthday);
    }

    @Override
    public String speak() {
        return "bark";
    }

    @Override
    public void pet(){}
}