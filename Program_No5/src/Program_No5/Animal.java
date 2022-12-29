package Program_No5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yuninda
 */
abstract class Animal {
    protected int legs;
    protected Animal (int legs){
        this.legs = legs;
    }
    abstract void eat();
    public void walk () {
        System.out.println("Hewan ini berjalan dengan " + legs + "kaki.");
    }
    private static class protect {

        public protect() {
        }
    }    
}
