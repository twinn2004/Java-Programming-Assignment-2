/*
Progarmming Assignment 2
Taylor Winn
June 2024 
 */

package assignment2;

public class Dice {

    private Die d1; // creating the instance variables
    private Die d2;

    public Dice(){
        this.d1 = new Die();    // initializing the die objects using the no argument constuctor
        this.d2 = new Die();
    }

    public Die getDie1(){
        return d1;  // getter for the first die value to access later in main program
    }

    public Die getDie2(){
        return d2;  // getter for second die value
    }

    public int sumOfFaces(){
        return (d1.getFaceValue() + d2.getFaceValue()); // getter for the num of the die values (first face value + second face value (cannot be less than 1 or more than 12))
    }

    public void rollDice(){ // rolling both dice in the same method call
        d1.roll();
        d2.roll();
    }
}
