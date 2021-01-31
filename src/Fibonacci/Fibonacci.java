/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author LAU
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers should i print:");
        int input = in.nextInt();
        for(int i =1;i<=input;i++){
            System.out.print(Fibonacci(i)+" ");
        
    }
       
        }
     public static int Fibonacci(int num){
            if(num == 1 || num == 2)
                return 1;
            return Fibonacci(num -1) + Fibonacci(num -2);
            
    }
    
}
