/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author Janlay & Inloran
 */
public class Lab_Act5_calculator {
   
    public static int add(int y, int z){
    return y + z;
    }
    public static int subt(int y, int z){
    return y - z;
    }
    public static int multi(int y, int z){
    return y * z;
    }
    public static int divi(int y, int z){
    return y / z;
    }
    public static float perc(float h, float i){
    return h *(i/100) ;
    }
    public static void main(String[] args) {
        int res1 = add(5,10);
        System.out.println("addition: " + res1);
        int res2 = subt(5,10);
        System.out.println("subtruction: " + res2);
        int res3 = multi(5,10);
        System.out.println("multiplication: " + res3);
        int res4 = divi(5,10);
        System.out.println("division: " + res4);
        float res5 = divi(60,13);
        System.out.println("percentage : " + res5 + "%");
        
        
        
        
    }
}
