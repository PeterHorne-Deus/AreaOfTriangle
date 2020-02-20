/*
 * Peter Horne-Deus
 * The is a program is a triangle area calculator
 * calendarCulminating.java
 * January 8, 2019
 */

package areaoftriangle;

/**
 *
 * @author pehor9164
 */

import javax.swing.*;

public class AreaOfTriangle {
   
    
    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        //Variables
        
        int x = 0;
        
        //Side Length variables
        double a,b,c;

        //Semi Perimiter
        double s = 0;
        
        //Total Area
        double area;
        
        try{
            do{
                //Getting user information for side lengths

                a = Double.parseDouble(JOptionPane.showInputDialog("Enter Side Lenth A in cm"));
                b = Double.parseDouble(JOptionPane.showInputDialog("Enter Side Lenth B in cm"));
                c = Double.parseDouble(JOptionPane.showInputDialog("Enter Side Lenth C in cm"));
                
                //Ensuring this is a scalene triangle
                if(a == b || b == c || a == c){
                    System.out.println("Values of sidelengths must all be different");
                    x = 0;
                }
                else{
                    x = 1;
                }
                
            }while (x != 1);
            
            //Calculating the semi perimiter
            s = (a + b + c)/2;
            
            //Ensuring data entered is valid
            if(s == 0 || a >= s || b >= s || c >= s){
                throw new Exception();

            }
            
            //Calculating area using Herons Formula
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

            //Final Output
            System.out.println("The area of the triangle is: " + area + " units squared");
            
        }
        catch(Exception e){
            System.err.println("Impossible side length data entered");
        }
        
        
    }
    
    
}
