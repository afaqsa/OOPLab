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
    int length;
    int breath;
    public Rectangle(int length,int breath){
        this.length = length;
        this.breath = breath;
    }
    void printArea(){
        System.out.println("The area is : "+ length*breath);
    }
    void printPerimeter(){
        System.out.println("The perimeter is : "+ 2*(length + breath));
    }
}

class Square extends Rectangle{
    
    Square(int side){
        super(side,side);
    }
}
class Test{
    public static void main(String[] args) {
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\t\t Area and perimeter of  square");
        System.out.println("--------------------------------------------------------------------------------");
        
        Square s = new Square(5);
        s.printArea();
        s.printPerimeter();
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\t Area and perimeter of Rectangle by the object of square");
        System.out.println("--------------------------------------------------------------------------------");
        
        s.breath=6;
        s.length=9;
        s.printArea();
        s.printPerimeter();
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\t Area and perimeter of Rectangle by the object of Rectangle");
        System.out.println("--------------------------------------------------------------------------------");
        
        Rectangle rec = new Rectangle(9, 6);
        rec.printArea();
        rec.printPerimeter();
        
        
    }
    
}