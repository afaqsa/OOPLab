/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.author;

/**
 *
 * @author afaqs
 */
public class Author {
    
    String author_name;
    String author_email;
    String gender;
    String book_name;
    static String name;
    //class constructor
    Author(String author_name, String author_email, String gender,String book_name){
        this.author_name =author_name;
        this.author_email =author_email;
        this.gender =gender;
        this.book_name =book_name;
        
    }
    //static Block
    static{
        System.out.println("-------------------------------------");
        System.out.print("     Information of Author ");
        
        
}
    static void fullInfo(){
        System.out.println(name);
        System.out.println("-------------------------------------");
    }
    //method
     void display(){
         fullInfo();
        System.out.println("The Authors name is :\t" + author_name );
        System.out.println("The Author's Email is :\t" + author_email );
        System.out.println("The gender of Author  is :\t" + gender );
        System.out.println("The Author's book is :\t" + book_name );
        
    }
     
     //static method    
   
    public static void main(String[] args) {
        Author author = new Author("Paul Deitel", "abcd123@gmail.com", "Meal", " How to program C");
        name = author.author_name;
        author.display();
    }
    
}
