/*
 *  Application Title:
 * Author: Ali Mortada
 * Keene State College Computer Science
 * Date:12/5/2021
 * Purpose: Creating a christmas tree
 */
package a.mortadahw05loops;

import java.util.Scanner;
import java.io.*;


/**
*
* @author Ali Mortada
*/
  
public class AmortadaHW05Loops {
         
    // Declaring ANSI_RESET so that we can reset the color
    public static final String color_RESET = "\u001B[0m";
    // Declaring the color
    // Custom declaration
    public static  String  color_star = "\u001B[33m";
    public static  String color_tree = "\u001B[32m";
    public static  String color_lightning = "\u001B[31m";
   public static int x = 1;
    
    
        Scanner scan = new Scanner(System.in);
    public static void main(String[] args) 
{
    while(x==1){
     
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What height of the tree do you want ? ");

        final int height = scan.nextInt();

        System.out.println("What width of the trunk do you want ? ");

        int width = scan.nextInt();
        int i;
        int j;
        int k;
        int space = width*5;
        int r = 1;
        int m = 1;

        // a for loop to use the height variable
        for(r = 1; r <= height; r++){
            for(i = m; i <= width; i++){
            //prints indentation
                    for(j = space; j >= i; j--){
                        System.out.print("  ");
                      }


                      // prints the stars
                      for(k = 1; k <= i; k++){
                          if (r ==1 && i==1){
                         System.out.print(color_star +"*  "+color_RESET);     
                          }
                          
                       else {  
                          
                         if(k==1 ){
                             System.out.print(color_lightning +"* "+color_RESET);
                         }
                         else if(k!=1 && k!=i ){
                           System.out.print(color_tree +"* "+color_RESET);
                       System.out.print(color_tree +"* "+color_RESET);
                      }
                         else if (k==i){
                          System.out.print(color_lightning +"* "+color_RESET);
                         }
//                        System.out.print("* ");
//                        System.out.print(color_lightning +"* "+color_RESET);
//                        System.out.print(color_tree +"* "+color_RESET);

                      }
                      }
                      // prints a new line
                      System.out.println(" ");

                  }
                  m+=2;
                  width+=2;
                  }

                for(i = 1; i <= 4; i++){
                    for(j = space *2 -4; j >= 1; j--){
                        System.out.print(" ");

                    }
                    for(k = 1; k <= 4; k++){ 

                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                Scanner scanner = new Scanner(System.in);

if (true) {
    System.out.println("do you want to continue? (y continue)");
    String input = scanner.nextLine();
    if (input.equals("y")) {
         System.out.println("Ok! Let's carry on!");
         
         
    }
    else{
    x=2;
 }
 }       
 }
 }
 }






