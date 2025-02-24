package Prelim;
import java.util.Scanner;
public class find_the_greatest_number {
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Input the first number");
    int  qq= scan.nextInt(); 
    
    System.out.println("Input the second number");
    int ww = scan.nextInt(); 
    
    System.out.println("Input the third number");
    int ee = scan.nextInt(); 
       
    if(qq >ww && qq>ee){System.out.println("the greatest number is : "+qq);
    
    }else if(ww >qq && ww>ee){System.out.println("the greatest number is : "+ww);
    
    }else if(ee>ww && ee>qq){ System.out.println("the greatest number is : "+ee);
    
    }else{System.out.println("kjasbdksadk");}
    
    }
}
