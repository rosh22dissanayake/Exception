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
        int y=2;
        do{
            try{
            Scanner in= new Scanner(System.in);
            
            System.out.println("Insert first number");
            int number1 = in.nextInt();
            
             System.out.println("Insert second number");
            int number2 = in.nextInt();
            
            System.out.println("Insert third number");
            int number3 = in.nextInt();  
                
            System.out.println("Insert fourth number");
            int number4 = in.nextInt();
                
            System.out.println("Insert fifth number");
            int number5 = in.nextInt();

            System.out.println("Insert sixth number");
            int number6 = in.nextInt();
                
            int total= (number1+number2+number4+number6) -(number3*number5);
            
            System.out.println("Answer ="+total);
             
            x=4;
            
        }  catch(Exception e){
                
           
              System.out.println("ERROR");
    }
    
}while(y==2);
    }
}
