/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class min {
     public static void main(String[] args){
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter two number");
         int a=obj.nextInt();
         int b=obj.nextInt();
         if(a<b)
             System.out.println("minimum is--" +a);
         else
             System.out.println("minimum is--" +b);
     }
}
         
    

