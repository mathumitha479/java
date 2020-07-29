/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myproject.no.pkg8;

import java.util.Scanner;

/**
 *
 * @author  mathu
 */
public class MyprojectNo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // power of the number
         Scanner obj=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=obj.nextInt();
        System.out.println("enter the p value");
        int p=obj.nextInt();
        System.out.println(Math.pow(n,p));
        
        
    }
    
}
