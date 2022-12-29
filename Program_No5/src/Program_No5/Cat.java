package Program_No5;


import <any?>;
import Program_No5.Animal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Cat extends Animal implements Pet {
    private String name;
    public Cat (String n) {
        super (4);
        name = n;
    }
    public Cat() {
        this("");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName (String n) {
        name = n;
    }
    @Override
    public void play () {
        System.out.println(name + " suka main dengan boneka ikan.");
    }
    @Override
    public void eat () {
        System.out.println("Kucing suka makan daging.");
    }

    private static class play {

        public play() {
        }
    }
    
}
