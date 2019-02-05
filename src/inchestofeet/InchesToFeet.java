/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inchestofeet;

import java.util.Scanner;

/**
 *
 * @author djluk
 */
public class InchesToFeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int feet, inches, totalInches;
        final int inchesInFoot = 12;
        
        System.out.print("Enter the number of inches: ");
        totalInches=input.nextInt();
        
        feet= totalInches / inchesInFoot;
        inches = totalInches % inchesInFoot;
        
        System.out.println(totalInches + " in feet is " + feet + " feet and "
                + inches + " inches.");
        
        // Added code to convert to yards
        double yards;
        final double INCHESPERYARD = 36;
        yards = totalInches / INCHESPERYARD;
        System.out.println(totalInches + " is equal to " + yards + " yards.");
    }
    
}
