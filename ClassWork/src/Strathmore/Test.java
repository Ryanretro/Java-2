/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strathmore;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args){
        Singer s1;
        Singer s2;
        
        s1= new Singer();
        s2= new Singer();
        
        Singer s3;
        Singer s4;
        
        s3 = new Singer( "Dax", "David Okoyi", 34);
        s4 = new Singer( "Tom", "Thomas MacDonald", 38);
        
        s1.introduce();
        s2.introduce();
        s3.introduce();
        s4.introduce();
        
    }
}
