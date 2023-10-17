/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spottest1;

/**
 *
 * @author CHAMATH
 */
import java.util.Scanner;
import java.util.*;
public class SpotTest1 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int[] Array = new int[10];

        for(int i = 0; i<Array.length; i++){
        System.out.print("Enter number");
        Array[i]=input.nextInt();
        }
         System.out.println("The original array is: ");
        for (int num : Array) {
            System.out.print(num + " ");
        }
        Arrays.sort(Array);
        System.out.println("\nThe sorted array is: ");
        for (int num : Array) {
            System.out.print(num + " ");
        }
    }
}
