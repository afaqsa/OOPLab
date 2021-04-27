/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redam;


/**
 *
 * @author afaqs
 */
public class RedomNumber {
    public static void main(String[] args) {
		// Create a Random object with seed 1000
		java.util.Random randomNumber = new java.util.Random(1000);

		// Displays the first 50 random integers between 0 and 100
		for (int i = 1; i <= 50; i++) {
			if (i % 10 == 0)
				System.out.println( randomNumber.nextInt(100));
			else
				System.out.print( randomNumber.nextInt(100) +"  ");
		}
	}
}
