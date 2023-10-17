/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q10;

/**
 *
 * @author CHAMATH
 */
import java.util.Scanner;
public class Inputs {
    
    public void Input(){
    Scanner input = new Scanner(System.in);
        
      System.out.print("Enter Name :");
      String Name = input.next();
      
      System.out.print("Enter your degree program :");
      String Degree = input.next();
        
      System.out.print("Hello "+Name + ". Your degree is "+Degree );
    }
}

