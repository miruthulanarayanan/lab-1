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
public class numtoword {
    public static void main(String[] args){
        int a[]=new int[20];
        int n=3,i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
                System.out.println("zero");
            else if(a[i]==1)
                    System.out.println("one");
            else if(a[i]==2)
                    System.out.println("two");
            else if(a[i]==3)
                    System.out.println("three");
            else if(a[i]==4)
                    System.out.println("four");
            else if(a[i]==5)
                    System.out.println("five");
            else if(a[i]==6)
                    System.out.println("six");
            else if(a[i]==7)
                    System.out.println("seven");
            else if(a[i]==8)
                    System.out.println("eight");
            else 
                    System.out.println("nine");
        }
    }
}
            
        
           
        
    

