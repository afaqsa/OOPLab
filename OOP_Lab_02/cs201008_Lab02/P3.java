/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p3;

/**
 *
 * @author afaqs
 */
public class P3 {
    public static void main(String[] args) {
        int num =5;
        int z =1;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = z; k >=1; k--) {
                System.out.print(Math.abs(i));
            }
            z+=2;
            System.out.println();
        }
        System.out.println("\n");
            z=1;
        for (int i = 1; i <= num; i++) {
            for (int j = num-1; j >= i; j--) {
                System.out.print(" ");
                
            }
            for (int k = z; k >=1; k--) {
                System.out.print(Math.abs(k-i)+1);
            }
            z+=2;
            System.out.println();    
        }
    }
}
