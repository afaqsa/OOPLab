/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author afaqs
 */
public class Computer {
        String Name;
        int ProcessingSpeed;
        
        Computer(){
            
        }
        Computer(Computer c1){
            Name =c1.Name;
            ProcessingSpeed =c1.ProcessingSpeed;
            
        }
        
        void setdata(String nam , int speed ){
            Name = nam;
            ProcessingSpeed = speed;
            
        }
        
        void showData(){
            System.out.println("Name is  "+ Name);
            System.out.println("Processing Speed is " + ProcessingSpeed);
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Computer c1 =new Computer();
        c1.setdata("MicroComputer", 500);
        c1.showData();
        
        Computer copyc1 = new Computer(c1);
        copyc1.showData();
        
        Desktop D1=new Desktop();
        D1.setdata("KhizarFolder", 200, "KF");
        D1.showData();
        
        
       Laptop L1 = new Laptop();
       L1.setdata("ForStudy", 300, 200);
       L1.showData();
    }
    
}
class Desktop extends Computer{
    String location;
    
    void setdata(String loca,int speed,String name){
        super.setdata(name, speed);
        location = loca;
    }
    @Override
    void showData(){
        super.showData();
        System.out.println("Location is "+ location);
    }
}

class Laptop extends Computer{
    int weight;
    
    void setdata(String num, int speed, int wei){
        super.setdata(num, speed);
        weight = wei;
    }
    @Override
    void showData(){
        super.showData();
        System.out.println("Weight is " + weight);
    }
}