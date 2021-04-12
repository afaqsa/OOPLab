/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p1;

import java.util.Scanner;

/**
 *
 * @author afaqs
 */
public class P1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String charater;
        
        System.out.println("Enter any alphabet : ");
        charater = scan.next();
        
          char Chara = charater.charAt(0);
        if(!(Chara>=65 && Chara <=90) && !(Chara >=97 && Chara <=122)){
            System.out.println("Erorr!! you not enter any alphabet..."+ charater.substring(0, 2));
        }
        else if(Chara == 'a' || Chara == 'e' || Chara == 'i' || Chara == 'o' || Chara == 'u' || Chara == 'A' || Chara == 'E' ||
                Chara == 'I' || Chara == 'O' || Chara == 'U' ){
            System.out.println("The charater you Enter it's a Vowel.");
        }
        else{
            System.out.println("The charater you enter it's a Constant."+ charater.substring(0, 3).toUpperCase());
        }
    }
    
}
