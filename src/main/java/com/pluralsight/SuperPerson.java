package com.pluralsight;

public abstract class SuperPerson {
//made the SuperPerson class an abstract class
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
    public abstract void fight (SuperPerson opponent);
    //changed the fight method into an abstract method because it overidden in the child classes
    //in order for the code to work, there needs to be a fight() method in the child classes

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
