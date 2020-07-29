/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.pkgnew.project;

import java.util.Scanner;


/**
 *
 * @author  mathu
 */
public class MyNewProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the A value");
        int a=obj.nextInt();
        int c=4*a;
        System.out.println("perimeter="+c);
   
    }
    
}
