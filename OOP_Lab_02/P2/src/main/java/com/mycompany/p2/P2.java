/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2;

import java.util.Scanner;

/**
 *
 * @author afaqs
 */
public class P2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int number_01 ;
        int number_02;
        int number_03;
        
        System.out.println("Enter the three numbers: ");
        number_01 = scan.nextInt();
        number_02 = scan.nextInt();
        number_03 = scan.nextInt();
        
        if((number_01 >= number_02) && (number_01 >= number_03)){
            System.out.println("Greater number is : "+ number_01);
        }
        else if((number_02 >= number_01) && (number_02 >= number_03)){
              System.out.println("Greater number is : "+ number_02);
        }
        else{
              System.out.println("Greater number is : "+ number_03);
        }   
    }
    
}
