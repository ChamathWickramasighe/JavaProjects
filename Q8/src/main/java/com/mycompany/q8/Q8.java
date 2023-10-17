/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q8;

/**
 *
 * @author CHAMATH
 */
import java.util.Scanner;
public class Q8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Array = new int[10];

        for(int i = 0; i<Array.length; i++){
        System.out.print("Enter number");
        Array[i]=input.nextInt();
        }
        int max = Array[0];
        for (int i = 0; i < Array.length; i++) {
        if (Array[i] > max) {
        max = Array[i];
        }
       }
       System.out.print("Maximum Number : " + max);
    }
}
