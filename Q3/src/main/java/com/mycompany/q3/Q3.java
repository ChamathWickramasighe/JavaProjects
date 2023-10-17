/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q3;

/**
 *
 * @author CHAMATH
 */
import java.util.Scanner;

public class Q3 {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int intOne = input.nextInt();
        System.out.print("Enter number 2 :");
        int intTwo = input.nextInt();
        
        if(intOne > intTwo){
            System.out.print(intOne + " is greater than " + intTwo );
        }
        else{
            System.out.print(intTwo + " is greater than " + intOne );
        }
    }
}
