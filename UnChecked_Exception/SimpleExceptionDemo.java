package com.mustafa.Exception;


import java.util.Scanner;
public class SimpleExceptionDemo{
    public static void main(String []args){
        Scanner sc=null;
        try{
            sc=new Scanner(System.in);
            int a=Integer.parseInt(sc.nextLine());
            int b=Integer.parseInt(sc.nextLine());
            System.out.println("You entered a = "+a+" and b = "+b);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            //System.out.println(e.printStackTrace());
        }
    }
}
