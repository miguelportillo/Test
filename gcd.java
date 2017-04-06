//----------------------------------------------------------------------
// gcd.java          by Miguel Portillo       portime0@sewanee.edu
//
// CSci 257 Project 4     Instructor: Professor Carl    April 3, 2017
//
//The purpose of this exercise is to design, implement, and test a program Euclid that
//repeatedly prompts the gcd of the entered pair. This program uses a recursive
//method.                          
//----------------------------------------------------------------------
import java.util.*;

public class gcd {

  protected Scanner sc = new Scanner(System.in);
  protected int x, y;

  public static void main (String [] args) {
    new gcd();
  }

/**
* The user must input two integers and calls the GCD method, the program returns the GCD.
* The user is then asked if they want to compute the GCD of two more integers. 
* The program will quit if the user says no.
*/
  public gcd() {
    boolean run = true;
    while(run) {
      System.out.print("Enter a number: ");
      int a = sc.nextInt();
      System.out.print("Enter a number: ");
      int b = sc.nextInt();
      System.out.println("gcd: " + gcd(a,b));
      System.out.print("Would you like to continue? (yes or no): ");
      String result = sc.next();
      if(result.equals("no"))
        run = false;
      }
     }

/**
* @param an x and y integer must be given.
* @precondition the GCD is computed after the program is provided with two valid integers.
* @postcondition computes the GCD of the two valid integers and gives the result to the user.
*/
  public int gcd (int x, int y) {
  if(x<y) {
    int temp = x;
    x=y;
    y=temp;
   }

  if(x%y==0) 
     return y;
   
  else return gcd(y, x%y);
  }
}

