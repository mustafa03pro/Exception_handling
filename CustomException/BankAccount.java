package com.mustafa.july15CustomException;
class InsufficientFundsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InsufficientFundsException() {
		
	}
	public InsufficientFundsException(String errmsg) {
		super(errmsg);
	}
	
}
class InvalidAmountException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidAmountException() {
		
	}
	public InvalidAmountException(String errmsg) {
		super(errmsg);
	}
	
}
class AccountNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AccountNotFoundException() {
		
	}
	public AccountNotFoundException(String errmsg) {
		super(errmsg);
	}
	
}
class LoanNotAllowedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LoanNotAllowedException() {
		
	}
	public LoanNotAllowedException(String errmsg) {
		super(errmsg);
	}
	
}
 interface Bank{
	 void deposit(double amount)throws InvalidAmountException;
	 void withdraw(double amount)throws InsufficientFundsException, InvalidAmountException;
	 void transfer(BankAccount toAccount, double amount)throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;
	 void applyForLoan(double amount)throws LoanNotAllowedException, InvalidAmountException;
	 public default double getBalance(double balance) {
		 return balance;
	 }
	 
	
}

public class BankAccount implements Bank
{
	private long accountNumber;
	private double balance;
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	@Override
	public void deposit(double amount) throws InvalidAmountException {
		if(amount<=0) {
			throw new InvalidAmountException("Amount should be positive")
		}
		else {
			balance=balance+amount;
			System.out.println("Deposit successful. New balance:"+getBalance(amount));
		}
		
		
	}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		if(amount<=0) {
			throw new InvalidAmountException("Amount should be positive");
			
		}
		else {
			if(amount>balance) {
				throw new InsufficientFundsException("Accont has insufficent fund");
			}
			else {
				balance=balance-amount;
				System.out.println("Amount withdraw succesfully "+getBalance(balance));
			}
			
		}
		
		
		
		
	}
	@Override
	public void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
		if(amount<=0) {
			throw new InvalidAmountException("Amount should be positive");
			
		}
		else if(toAccount==null) {
			throw new AccountNotFoundException("your accont not found");
			
			
		}
		else {
			if(amount>balance) {
				throw new InsufficientFundsException("Accont has insufficent fund");
			}
			else {
				balance=balance-amount;
				System.out.println("Amount transfer succesfully "+getBalance(balance));
			}
			
		}
		
		
		
	}
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
		if(amount<=0) {
			throw new InvalidAmountException("Amount should be positive");
			
		}
		else if(amount>50000) {
			throw new LoanNotAllowedException("we can't approve loan the amount is large");
			
		}
		else {
			System.out.println("loan approved");
		}
		
		
	}
	

	

}
