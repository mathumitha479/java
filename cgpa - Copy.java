/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cgpa;
import java.util.Scanner;

/**
 *
 * @author mathu
 */
public class Cgpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // cgpa
        Scanner obj=new Scanner(System.in);
        double m[]=new double[10];
        double c[]=new double[10];
        double sum=0,csum=0;
        int i;
        System.out.println("enter number of subject");
        int n=obj.nextInt();
        for(i=0;i<n;i++)
        {
          System.out.println("enter grade and credit for"+(i+1)+"subject");
          m[i]=obj.nextDouble();
          c[i]=obj.nextDouble();
          sum=sum+m[i]*c[i];
          csum=csum+c[i];
        }
        System.out.println("cgpa...."+(sum/csum));
    }
}

    

