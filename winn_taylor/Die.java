/*
Progarmming Assignment 2
Taylor Winn
June 2024 
 */

package assignment2;

import java.util.Random;

public class Die {
    private int faceValue;
    
    public Die(){
        this.faceValue = 1; // no argument constructor automatically sets the face value as 1
    }

    public int getFaceValue(){
        return faceValue;   // getter for the face value
    }

    public void setFaceValue(int val){
        this.faceValue = val;   // setter method for the face value 
    }

    public void roll(){
        Random rand = new Random(); // initilizing random element to generate random value for the face value
        faceValue = rand.nextInt(6) + 1;    // creating random value in the range [1,6] both inclusive
    }
}
