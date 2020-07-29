/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.project.no.pkg7;

import java.util.Scanner;

/**
 *
 * @author  mathu
 */
public class MyProjectNo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the A value");
        int a=obj.nextInt();
        System.out.println("enter the B value");
        int b=obj.nextInt();
        System.out.println("enter the c value");
        int c=obj.nextInt();
        if(a>b&&a>c)
            System.out.println("a is greater");
        else if(b>a&&b>c)
            System.out.println("b is greater");
        else
            System.out.println("c is greater");
                
            
        
        
    }
    
}
