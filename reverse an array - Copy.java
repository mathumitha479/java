/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reverse;

import java.util.Scanner;

/**
 *
 * @author  mathu
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // reversing an array
        
     int counter, i=0, j=0, temp;
     int number[] = new int[100];
     Scanner scanner = new Scanner(System.in);
     System.out.print("How many elements you want to enter: ");
     counter = scanner.nextInt();
     for(i=0; i<counter; i++)
      {
       System.out.print("Enter Array Element"+(i+1)+": ");
       number[i] = scanner.nextInt();
      }
     j = i - 1;
     i = 0;
      scanner.close();
      while(i<j)
      {
       temp = number[i];
       number[i] = number[j];
       number[j] = temp;
       i++;
       j--;
      }
      System.out.print("Reversed array: ");
      for(i=0; i<counter; i++)
      {
       System.out.print(number[i]+ " ");
      }
    }
}

    

