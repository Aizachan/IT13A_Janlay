/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;



/**
 *
 * @author Aiza
 */
public class Lab_Act1_Arithmetics {
     public static void main(String[] args) {

       int a = 10;
       int b = 4;
       int c = 6;
       int d = 3;
       
       int r1 = a * b + c;
       int r2 = a - b % c;
       int r3 = a + b + c / d;
       int r4 = a * c - b * b ;
       
         System.out.println("10 * 4 + 6 = " + r1);
         System.out.println("(10 - 4) % 6 = " + r2);
         System.out.println("(10 + 4 + 6) / 3 = " + r3);
         System.out.println("10 * 6 - (4 * 4) = " + r4);
      
    }

}

