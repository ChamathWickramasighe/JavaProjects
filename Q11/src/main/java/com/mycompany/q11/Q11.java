/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q11;

/**
 *
 * @author CHAMATH
 */
import java.util.Scanner;
public class Q11 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your age :");
      int age = input.nextInt();
      
      Age objInput = new Age();
       objInput.Age(age);
        
    }
}
