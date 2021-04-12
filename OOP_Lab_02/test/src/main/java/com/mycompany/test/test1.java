/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

/**
 *
 * @author afaqs
 */
public class test1 {
     int age;
    
    test1(int a){
        age =a;
    }
    void display(){
       
        System.out.println("Hello hi " + age);
    }
    public static void main(String[] args) {
        test1 obj;
       obj= new test1(25);
       obj.display();
        System.out.println(age);
       
       
    }
    
}
