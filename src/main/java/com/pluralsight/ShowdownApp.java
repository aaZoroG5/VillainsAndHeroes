package com.pluralsight;

public class ShowdownApp {

    public static void main(String[] args) {

        //create 2 super people
        SuperPerson spiderMan = new SuperPerson("Spider-Man", 100);
        SuperPerson goblin = new SuperPerson("Green Goblin", 100);

        //print status of both supers
        System.out.println(spiderMan.getStatus());
        System.out.println(goblin.getStatus());

        //make both supers take damage
        spiderMan.takeDamage(15);
        goblin.takeDamage(30);

        //print out updated status
        System.out.println(spiderMan.getStatus());
        System.out.println(goblin.getStatus());

        if(spiderMan.isAlive()){
            System.out.println("Spidey is alive!");
        }
        else{
            System.out.println("Spidey is down!");
        }

        if(goblin.isAlive()){
            System.out.println("Goblin is alive!");
        }
        else{
            System.out.println("Goblin is down!");
        }

        spiderMan.fight(goblin);
        goblin.fight(spiderMan);

        SuperPerson myHero = new SuperPerson("Wolverine",100);
        myHero.fight(goblin);
    }
}
