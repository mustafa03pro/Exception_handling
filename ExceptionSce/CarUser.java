package com.mustafa.july14CustomException;

import java.util.Scanner;

class CarStoppedException extends Exception{
	

	
	private static final long serialVersionUID = 1L;
	public CarStoppedException() {
		
	}
	public CarStoppedException(String errmsg) {
		super(errmsg);
	}
	
}
class CarPunctureException extends Exception{

	
	private static final long serialVersionUID = 1L;
	public CarPunctureException() {
		
	}
	public CarPunctureException(String errmsg) {
		super(errmsg);
	}
	
}
class CarHeatException extends Exception{

	
	private static final long serialVersionUID = 1L;
	public CarHeatException() {
		
	}
	public CarHeatException(String errmsg) {
		super(errmsg);
	}
	
}

 class CarTest {

	public static void Stop(String str) throws CarStoppedException
	{
		if(str.equalsIgnoreCase("stop")) {
			throw new CarStoppedException("Car stopped for some reason."); 
		}
		else {
			System.out.println("Car not stalled.");
		}
	}
	public static void puncture(String str2)throws CarPunctureException
	{
		if(str2.equalsIgnoreCase("Puncture")) {
			throw new CarPunctureException("Car is punctured.");
			
		}
		else {
			System.out.println("Car not punctured.");
		}
	}
	public static void carHeat(int x)throws CarHeatException
	{
		if(x>=50) {
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
			
		}
		else {
			System.out.println("Car temperature normal.");
		}
	}

}
public class CarUser {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		try(sc){
			System.out.println("1:stop\n2:puncture\n3:heat");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				System.out.print("enter the stop or not : ");
				String str3=sc.nextLine();
				CarTest.Stop(str3);
				break;
			case 2:
				System.out.print("enter the car punchered or not : ");
				String str4=sc.nextLine();
				CarTest.puncture(str4);
				break;
			case 3:
				System.out.print("enter the heat percentage: ");
				int x1=sc.nextInt();
				CarTest.carHeat(x1);
				break;
			}
			
			
		
		}
		catch(CarStoppedException e) {
			System.err.println(e.getMessage());
		}
		catch(CarPunctureException e) {
			System.err.println(e.getMessage());
		}
		catch(CarHeatException e) {
			System.err.println(e.getMessage());
		}
	}

}

