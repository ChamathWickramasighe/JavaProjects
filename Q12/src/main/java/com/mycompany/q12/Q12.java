/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q12;

/**
 *
 * @author CHAMATH
 */
import java.util.Scanner;
public class Q12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter radius value: ");
        double radius = input.nextDouble();
        
        EncapData objEncap = new EncapData();
        objEncap.GetRadius(radius);
        
        objEncap.SetArea();
        objEncap.SetCir();
        
        System.out.println("Area: " + objEncap.GetArea()); 
        System.out.println("Circum: " + objEncap.GetCir()); 
        
    }
}
