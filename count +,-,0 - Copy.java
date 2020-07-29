/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.program.pkg1;
import java.util.Scanner;
/**
 *
 * @author  mathu
 */
public class MyProgram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // count positive,negative,and zero
        int countp=0, countn=0, countz=0, i;
        int arr[] = new int[10];
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n=obj.nextInt();
        for(i=0; i<n; i++)
        {
          arr[i] = obj.nextInt();
        }
        for(i=0; i<n; i++)
        {
          if(arr[i] < 0)
        {
          countn++;
        }
        else if(arr[i] == 0)
        {
          countz++;
        }
        else
        {
           countp++;
        }
        }
        System.out.print(countp + " Positive Numbers");
        System.out.print("\n" + countn + " Negative Numbers");
        System.out.print("\n" + countz + " Zero");
    }
    
}
