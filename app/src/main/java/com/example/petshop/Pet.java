package com.example.petshop;

import java.util.Date;

public class Pet {
    private String name;
    private Date birthday;

    public Pet (String name){
        this.name = name;
        this.birthday = new Date();
    }
    public  Pet (String name,Date birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
