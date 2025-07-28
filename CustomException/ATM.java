package com.mustafa.july15CustomException;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		 BankAccount acc1 = new BankAccount(1111, 60000);
			BankAccount acc2 = new BankAccount(2222, 3000);
			Customer customer1 = new Customer("Alice", acc1);
			Customer customer2 = new Customer("Bob", acc2);
			System.out.println("Select an option :\r\n"
					+ "           1. Deposit\r\n"
					+ "           2. Withdraw\r\n"
					+ "           3. Transfer\r\n"
					+ "           4. Loan Application\r\n"
					+ "           5. Check Balance\r\n"
					+ "           6. Exit\r\n"
					+ "");
			Scanner sc=new Scanner(System.in);
			int choice=Integer.parseInt(sc.nextLine());
			try(sc){
				switch(choice) {
				case 1:
					double amount=sc.nextDouble();
					acc1.deposit(amount);
					break;
				case 2:
					double amount1=sc.nextDouble();
					acc1.withdraw(amount1);
					break;
				case 3:
					double amount2=sc.nextDouble();
					acc1.transfer(acc1, amount2);;
					break;
				case 5:
					double amount3=sc.nextDouble();
					acc1.getBalance(amount3);
					break;
				case 4:
					double amount4=sc.nextDouble();
					acc1.applyForLoan(amount4);
					break;
				
				case 6:
					
				System.out.println("thank you visit again");
				}
			}
			catch(Exception e) {
				System.err.println(e);
				
			}
			
//			try(sc){
//				System.out.println("enter your name");
//				String name=sc.nextLine();
//				if(name.equalsIgnoreCase("alice")) {
//					customer1.getAccount();
//				}
//				
//			}
//			catch(Excep)

	}

}
