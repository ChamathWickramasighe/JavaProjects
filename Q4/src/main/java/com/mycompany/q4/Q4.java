/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q4;

/**
 *
 * @author CHAMATH
 */
import java.util.Scanner;
public class Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int intOne = input.nextInt();
        
        if(intOne == 0){
            System.out.print("You entered 0");
        }
        else{
            for(int x = intOne; x>=0;x--)
                System.out.print(x);
        }    
        
        
    }
}
