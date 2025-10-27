package com.pluralsight;

public class SuperVillain extends SuperPerson {

    public SuperVillain(String name, int health, int evilness){
        //super is synonymous with parent
        super(name, health);

        this.experiencePts = evilness;
    }

}
