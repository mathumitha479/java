/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//fibonacci series
package my.project.pkg3;

/**
 *
 * @author  mathu
 */
public class MyProject3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //fibonacci series
        int a=1;
        int b=1;
        int c,i;
        System.out.println(a);
        System.out.println(b);
        for(i=0;i<=10;i++)
        {
            c=a+b;
        
        System.out.println(c);
        a=b;
        b=c;
        i++;
        }
        
        }
    
}
