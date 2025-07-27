package com.mustafa.july14CustomException;
class Employee{

	public Employee() {
		System.out.println("It is a employee constructor");
	}
	
}
class Student{

	public Student() {
		System.out.println("it is a student constructor");
	}
	
}

public class DynaminObjectCreation
{
  public static void main(String[] args)
  {
	  try {
		
		  @SuppressWarnings("deprecation")
		  Object obj=Class.forName(args[0]).newInstance();
		  System.out.println("object created for:"+obj.getClass().getName());
	  	}
	  catch (ClassNotFoundException e) {
		System.err.println("class not found");
	}
	  catch (Exception e) {
		  System.err.println("genral exception");
		  
		
	}
	
  }
}
