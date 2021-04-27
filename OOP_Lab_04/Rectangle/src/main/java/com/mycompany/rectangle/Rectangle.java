/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rectangle;

/**
 *
 * @author afaqs
 */
public class Rectangle {
    private int lenght; //private access modifier
    private int breadth;
    static int value =0;   //static variable
    //non-parameterized constructor
    public Rectangle() {
       lenght =0;
       breadth =0;
    }
    //parameterized constructor
    public Rectangle(int lenght, int breadth) {
        this.lenght = lenght;// using this pointer 
        this.breadth = breadth;
    }
    
    //accessor or getter which get the lenght
    public int getLenght(){
        return lenght;
    }
    
    //accessor or getter which get the breadth
    public int getBreadth(){
        return breadth;
    }
    
    //mutators or setter which set's the value of lenght
    public void setLenght(int lenght){
        this.lenght = lenght;
    }
      
    //mutators or setter which set's the value of breadth
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    
    //static function or mathod 
    static void Heading(){
        System.out.println("\t***********************************");
        System.out.println("\t*\t RECTANGLE CLASS \t  *");
        System.out.println("\t***********************************");
    }
    //for showing the lenght and breadth of Rectangle 
    public void display(){
        System.out.printf("The lenght of %d Rectangle is : %d\n", ++value,lenght);
        System.out.printf("The breadth of %d Rectangle is : %d\n",value,breadth);
    }
    
    public static void main(String[] args) {
        Heading();
        Rectangle rect1 =new Rectangle();
        Rectangle rect2 = new Rectangle(23, 87);
        
        rect1.setLenght(34);
        rect1.setBreadth(67);
        rect1.display();
        rect2.display();
        
    }
 
}
