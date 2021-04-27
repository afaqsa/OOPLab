/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.member;

/**
 *
 * @author afaqs
 */
public class Member {
    
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    
    void printSalary(){
        System.out.println("Salary is "+salary );
    }
    
    void display(){
        System.out.println("Name  \t\t: "+name);
        System.out.println("Age  \t\t: "+ age);
        System.out.println("Phone Number\t: "+ phoneNumber);
        System.out.println("Address  \t: "+address);
      
    }
}

class Employee extends Member{
    String specialization="N/A";
    
}

class Manager extends Member{
    String department="N/A";
}

class Test{
    public static void main(String[] args) {
        Employee emp1 =new Employee();
        
        emp1.name = "Sajad";
        emp1.age = 25;
        emp1.phoneNumber = "034538976099";
        emp1.address="new karachi";
        emp1.salary = 45000;
        emp1.specialization="MBA";
        emp1.display();
        emp1.printSalary();
        System.out.println("secialization is :"+emp1.specialization);
        
        
        Manager mag1 =new Manager();
        
        mag1.name = "Aftab";
        mag1.age = 45;
        mag1.phoneNumber = "03422189767";
        mag1.address="DHA phase 7";
        mag1.salary = 80000;
        mag1.department ="Dotting";
        mag1.display();
        mag1.printSalary();
        System.out.println("Department is:"+mag1.department);
        
    }
    
}




