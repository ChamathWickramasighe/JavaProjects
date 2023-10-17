/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q12;

/**
 *
 * @author CHAMATH
 */
public class EncapData {
    
    private double Radius,Area,Circum;
    private double Pi = Math.PI;
    
    public void GetRadius(double x){
        Radius = x;
    }
    public void SetArea(){
         Area = Pi * (Radius*Radius);
    }
    public void SetCir(){
         Circum = 2* Pi * Radius;
    }
    
    public double GetArea(){
        return Area;
    }
    public double GetCir(){
        return Circum;
    }
}
