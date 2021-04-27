/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stude;

/**
 *
 * @author afaqs
 */
public class StaticVar {
         public static void main(String[]args){
     Student s1=new Student(1,"Anokshi");
     Student.counter();
     s1.display();
     Student s2=new Student(2,"kukreja");
     Student.counter(); 
     s2.display();
    }
}

class Student {
    
    int rollno;
    String name;
    //String university="dsu";
    static int count;
    static String university="DSU";
    
    Student(int r,String n){
    rollno=r;
    name=n;
    }
    public static void counter(){
        count++;
    }
    void display(){
        System.out.println(rollno+""+name+""+university+""+count);
    }
}
 

