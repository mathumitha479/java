/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//simple calculator using switch case
package my.project.pkg6;

import java.util.Scanner;

/**
 *
 * @author  mathu
 */
public class MyProject6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // calculator
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the A value");
        int a=obj.nextInt();
        System.out.println("enter the B value");
        int b=obj.nextInt();
        System.out.println("enter the operation");
        char c=obj.next().charAt(0);
        switch(c)
        {
            case'+':
                System.out.println("add"+(a+b));
                break;
            case'-':
                System.out.println("sub"+(a-b));
                break; 
            case'*':
                System.out.println("mul"+(a*b));
                break;
            case'/':
                System.out.println("div"+(a/b));
                break;   
            default:
                System.out.println("cannot perform");
                break;
                
                
                
            
             
        }
        
        
    }
    
}
