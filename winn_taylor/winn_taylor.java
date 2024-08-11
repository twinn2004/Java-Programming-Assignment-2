/*
Progarmming Assignment 2
Taylor Winn
June 2024 
 */

package assignment2;

public class winn_taylor {
    public static void main(String[] args){

        Dice dice = new Dice(); // creating new dice object containing the die objects
        int[] occurrences = new int[11];    // integer array to store occurence values

        for(int i = 0; i < 1000; i++){
            dice.rollDice();    // rolling each dice 1000 times 
            occurrences[dice.sumOfFaces() - 2]++; // keeping track of the number of occurences for each by putting them in the equivelent index value (value - 1)
        }

        
        for (int i = 0; i < occurrences.length; i++) {  // printing out the number of occurences for each side
            System.out.println("Number of " + (i + 2) + "s are " + occurrences[i]);
        }

        System.out.println("Graph");
        DrawHistgram(occurrences);  // calling the histogram method to print it out

    }


public static void DrawHistgram(int[] occurrences){ // histogram method for aesthetic / simplicity
    
    for (int level = 150; level >= 0; level -= 25) {    // for each level we are decrimenting by 25 (start at 150, eventally reach 0)
        if (level < 100) {
            if(level != 0){
                System.out.print(" ");  // formatting based on how many figures are in each number 
            } else {
                System.out.print("  ");
            }
        }
        System.out.print(level + "|");  // more formatting

        for (int i = 2; i <= 12; i++) { // there are 10 possible x values, starting from 2 (you can only have 1+1 on 2 dice worst case senario)
             if(occurrences[i-2] >= level){ // if the value is greater than the y value being tested, we want to add a * to the histogram to signify there is a value that high
                if(i < 10){
                    System.out.print("*  ");    // formatting
                } else {
                    System.out.print("*   ");
                }
             } else {
                if(i < 10){ 
                    System.out.print("   ");    // more formatting (checking for 1 vs 2 figure numbers)
                } else {
                    System.out.print("    ");
                }
             }
        }
        System.out.println();   
    }

    
    System.out.print("    ");   // since there arent any y values on the bottom row we can skip the first few characters
    for (int i = 2; i <= 13; i++) {
        if(i < 12){
            System.err.print("___");    // printing the underscores above the actual x values 
        } else {
            System.err.print("__");
        }
    }
    System.out.println();   // going down a line so we can print x values under the underscores
    System.out.print("    ");
    for (int i = 2; i <= 12; i++) {
        if(i < 12){
            System.err.print(i+"  ");   // formatting. 
        } else {
            System.err.print(i+" ");
        }
    }
}


}