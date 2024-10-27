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
        int p=1;
        do{
            try{
            Scanner in= new Scanner(System.in);
            
            System.out.println("add first number");
            int num1 = in.nextInt();
            
             System.out.println("add second number");
            int num2 = in.nextInt();
            
            System.out.println("add third number");
            int num3 = in.nextInt();  
                
            System.out.println("add fourth number");
            int num4 = in.nextInt();
                
            System.out.println("add fifth number");
            int num5 = in.nextInt();

            System.out.println("add sixth number");
            int num6 = in.nextInt();

            System.out.println("add seventh number");
            int num7 = in.nextInt();
                
            int result= (num1+num2+num4+num7+num6+num3) -(num5);
            
            System.out.println("Answer ="+result);
             
            q=3;
            
        }  catch(Exception e){
                
           
              System.out.println("ERROR");
    }
    
}while(p==1);
    }
}
