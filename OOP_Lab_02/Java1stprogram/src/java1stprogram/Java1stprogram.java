/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1stprogram;

/**
 *
 * @author afaqs
 */
public class Java1stprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String s1= "Hi! How are you? ";
    String s2 = " Hello i'm fine";
    int a = 1500000000;
      long lon = 1500000000000000000L;
      double dou= 20.0d;
      boolean bol;
      
        System.out.println(s1 + s2);
        System.out.println(a + " \n" + lon + " \n " + dou);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.length());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
    }
    
}
