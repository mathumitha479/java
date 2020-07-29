/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myprojectno9;

import java.util.Scanner;

/**
 *
 * @author mathu
 */
public class Myprojectno9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // break integer into digits
        int n,m,a,i=1,counter=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the value");
        n=obj.nextInt();
        m=n;
        while(n>0)
        {
            
            n=n/10;
            counter++;
        }
        while(m>0)
        {
            a=m%10;
            System.out.println("position"+counter+"."+a);
            m=m/10;
            counter--;
        }
        
    }
    
}
