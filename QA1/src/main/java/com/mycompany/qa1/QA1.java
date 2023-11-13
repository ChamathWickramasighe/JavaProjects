/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.qa1;

/**
 *
 * @author CHAMATH
 */
import java.util.Scanner;
public class QA1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("How many numbers are there for calculation");
        int choice = input.nextInt();
        
       Summation ObjSum = new Summation();
       switch(choice){
           case 2:
               System.out.println("Enter Number 1");
               int num1 = input.nextInt();
               System.out.println("Enter Number 2");
               int num2 = input.nextInt();
               ObjSum.Sum(num1, num2);
               break;
               
           case 3:
               System.out.println("Enter Number 1");
               int num3 = input.nextInt();
               System.out.println("Enter Number 2");
               int num4 = input.nextInt();
               System.out.println("Enter Number 3");
               int num5 = input.nextInt();
               ObjSum.Sum(num3, num4,num5);
               break;
               
            case 4:
               System.out.println("Enter Number 1");
               int num6 = input.nextInt();
               System.out.println("Enter Number 2");
               int num7 = input.nextInt();
               System.out.println("Enter Number 3");
               int num8 = input.nextInt();
               System.out.println("Enter Number 4");
               int num9 = input.nextInt();
               ObjSum.Sum(num6, num7,num8,num9);
               break;
       }
    }
}
