package Program_No5;


import Program_No5.Fish;
import Program_No5.Cat;
import Program_No5.Animal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fish f = new Fish();
        Cat c = new Cat("Rima");
        Animal x = new Fish();
        Animal y = new Cat ();
        Animal z = new Spider();
        
        f.play();
        c.play();
        
        x.eat();
        y.eat();
        z.eat();
        
        y.walk();
        x.walk();
    }
    }
    
}
