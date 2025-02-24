/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRILEM;

/**
 *
 * @author Aiza
 */
import java.util.Scanner;
public class ACT2_EXERCISE {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Input the first number: ");
        int x = s.nextInt();
        System.out.println("Input the second number: ");
        int y = s.nextInt();
        System.out.println("Input the third number: ");
        int z = s.nextInt();
        
        if(x >= y){
            if(x >= z){
                System.out.println("z is the greater number:");
            }
            else{
                System.out.println("greater number is: "+ z );
            }
        } else{
              if(y >= z){
                  System.out.println("2nd greater number is :"+ y);
              }    
              else{
                  System.out.println("greatest number: "+ z);
              }
            
        }
    }
}
