/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author afaqs
 */
public class BankAccount {
    
     int account_number;
     String holder_name;
     double balance;
        
     BankAccount(int account_number,String holder_name,double balance){
        this.account_number = account_number;
        this.holder_name = holder_name;
        this.balance = balance;
    }
     // for amount cridet
     void credit(int amount){
         this.balance = balance -amount;
     }
     //for showing result on screen 
     void show(){
         System.out.println("Account Number is : \t" + account_number);
         System.out.println("Account Holder's Name is : \t"+ holder_name);
         System.out.println("Current Balance is :\t"+ balance);
         System.out.println();
     }
    public static void main(String[] args) {
        //making objects 
        BankAccount person_1 = new BankAccount(101003, "Afaq", 300000);
        BankAccount person_2 = new BankAccount(102304, "Jon", 2569900); 
        BankAccount person_3 = new BankAccount(156234, "Aftab", 2390700);
       
        //credit amount
       person_1.credit(70000);
       person_2.credit(12000);
       person_3.credit(130921);
       //displaying result on screen 
       person_1.show();
       person_2.show();
       person_3.show();
       
        
    }
    
}
