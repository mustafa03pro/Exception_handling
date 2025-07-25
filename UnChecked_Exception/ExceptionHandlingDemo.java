package com.mustafa.Exception;


import java.util.Scanner;
public class ExceptionHandlingDemo{
    public static void  handleExceptions(String str){
        try{
            //System.out.println("Length of the input string: "+str.Length());
            int a=str.length();
            int num=Integer.parseInt(str);
            System.out.println("Length of the input string: "+a );
            System.out.println("Converted to integer: "+num);


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String []args){
        
        Scanner sc=null;
        sc=new Scanner(System.in);
        String str=sc.nextLine();
        handleExceptions(str);
       
    }
}