/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//distancee
package my.project.pkg5;
import java.util.*;

/**
 *
 * @author  mathu
 */
public class MyProject5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // distance between two points
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the x1 value");
        int x1=obj.nextInt();
        System.out.println("enter the x2 value");
        int x2=obj.nextInt();
        System.out.println("enter the y1 value");
        int y1=obj.nextInt();
        System.out.println("enter the y2 value");
        int y2=obj.nextInt();
        int step1=(x2-x1)*(x2-x1);
        int step2=(y2-y1)*(y2-y1);
        double distance=Math.sqrt((step1)+(step2));
        System.out.println("distance="+distance);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
