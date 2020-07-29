/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//product discount
package my.project.pkg4;
import java.util.*;

/**
 *
 * @author  mathu
 */
public class MyProject4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // discount of the product
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the original amount");
        double a=obj.nextDouble();
        System.out.println("enter the discount");
        double b=obj.nextDouble();
        double pay=(a*b)/100;
        System.out.println("want to pay"+(pay-a));
       
        
        
    }
    
}
