/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Mr
 */
public class Lab3 {

   /* private static class StaticVariablelab3 {

        public StaticVariablelab3() {
        }

        private void funcn() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }*/

 
      static int var1=77;
      String var2;
      public static void main(String args[]){
          Lab3  ob1 = new Lab3();
          ob1.var2="I'm Object1";
          System.out.println("Static Variable:"+var1);
          System.out.println("Non-static Variable:"+ob1.var2);
      }
  }


   /* class StaticMethodlab3{
        static int i = 100;
        static String s = "Beginnersbook";
        static void display()
        {
            System.out.println("i:"+i);
             System.out.println("s:"+s);
                    
        }
        void funcn()
        {
            
            display();
        } 
        public static void main(String args[]){
        StaticVariablelab3 obj = new StaticVariablelab3();   
        obj.funcn();
        display();
        }
    }
}
 */

