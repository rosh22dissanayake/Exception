/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exception;

import java.util.*;
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=1;
        do{
            try{
            Scanner in= new Scanner(System.in);
            
            System.out.println("Enter first number");
            int num1 = in.nextInt();
            
             System.out.println("Enter second number");
            int num2 = in.nextInt();
            
            System.out.println("Enter third number");
            int num3 = in.nextInt();    
                
            int total= num1+num2+num3;
            
            System.out.println("Answer ="+total);
             
            x=4;
            
        }  catch(Exception e){
                
           
              System.out.println("You can't do that");
    }
    
}while(x==1);
    }
}
