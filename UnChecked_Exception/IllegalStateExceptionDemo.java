package com.mustafa.Exception;


//package com.mustafa.Exception;





import java.util.Scanner;
public class IllegalStateExceptionDemo{
  static void throwIllegalException() {
     try {
         throw new IllegalStateException("MyException");
      
     } 
     catch (IllegalStateException objA) {
       
         System.out.println("Caught: " + objA);
        
     }
  }
  public static void main(String []args){
      System.out.println("Calling throwIllegalException from main method:");
     
          throwIllegalException();
   
 }

          
          

     
   
 
}
