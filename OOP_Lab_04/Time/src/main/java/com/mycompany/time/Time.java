/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.time;

/**
 *
 * @author afaqs
 */
public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    
    public Time(int h ,int m, int s ){
        hour = h;
        minute =m;
        second = s;
    }
    public int getHour(){
        setHour(hour);
        return hour;
    }
    public int getMinute(){
        setMinute(minute);
        return minute;
    }
    public int getSecond(){
        setSecond(second);
        return second;
    }
    public void setHour(int h){
        hour = ((h>=0 && h<24)? h :0);
    }
    public void setMinute(int m){
        minute = ((m>=0 && m<60)? m:0);
    }
    public void setSecond(int s){
        second =((s>=0 && s<60)? s:0);
        
    }
    public void setTime(int h,int m,int s){
         hour = ((h>=0 && h<24)? h :0);
         minute = ((m>=0 && m<60)? m:0);
         second =((s>=0 && s<60)? s:0);
    }
    public void print(){
        System.out.printf("%02d:%02d:%02d \n",hour,minute,second);
    }
    public static void main(String[] args) {
        Time time =new Time(2,53,20);
        time.print();
        time.setTime(23, 11, 56);
        time.print();
    }
}
