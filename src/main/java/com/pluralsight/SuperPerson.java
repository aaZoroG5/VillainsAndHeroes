package com.pluralsight;

public class SuperPerson {

    //create the class properties
    protected String name;
    protected int health;
    protected int experiencePts;//NOTE: we made the properties "protected" so the child classes can access them

    //create the class constructor
    public SuperPerson(String name, int health) {
        this.name = name;
        this.health = health;
    }

    //method to determine if the super is alive
    public boolean isAlive(){
        if(this.health > 0 ){
            return true;
        }
        return false;
    }

    //if we take damage it should lower our health
    public void takeDamage(int amountOfDamage){
        this.health -= amountOfDamage;
        if(this.health < 0){
            this.health = 0;
        }
    }

    //this method allows one super person to fight another super person
    public void fight (SuperPerson opponent){
        System.out.println(this.getName() + " is ready to fight " + opponent.getName());
    }

    public String getStatus(){
        return this.getName() + " has " + this.getHealth() + " health ";
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperiencePts() {
        return experiencePts;
    }

    public void setExperiencePts(int experiencePts) {
        this.experiencePts = experiencePts;
    }
}
