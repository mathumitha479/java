/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.program.pkg10;
import java.util.Scanner;
/**
 *
 * @author  mathu
 */
public class MyProgram10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // if user enter 0 to 9 display valid else display invalid
        System.out.println("press key");
        Scanner obj=new Scanner(System.in);
       
        int a=obj.nextInt();
        switch(a)
        {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        System.out.println("valid....");
         break;
        default:
         System.out.println("invalid....press(0 to 9)");
}
}
}

    

