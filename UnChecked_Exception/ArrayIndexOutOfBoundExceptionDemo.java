package com.mustafa.Exception;





//package com.mustafa.Exception;





import java.util.Scanner;
public class ArrayIndexOutOfBoundExceptionDemo{
  public static void main(String []args){
      Scanner sc=null;
      try{
          sc=new Scanner(System.in);
          //int a=Integer.parseInt(sc.nextLine());
           int a[] = new int[2];
           a[0] = 10;
           a[1] = 20;
          int n=Integer.parseInt(sc.nextLine());
          if(n<=1) {
          	System.out.println(a[n]);
          }
          else throw new ArrayIndexOutOfBoundsException();
          

          
          

      }
      catch(ArrayIndexOutOfBoundsException e){
          System.out.println(e.getMessage());
          System.out.println(e.toString());
          e.printStackTrace();
          System.out.println("You tried to access an invalid array index. Please check the index range.");
      }
  }
}
