
/*
/* Create an abstract class called "BankAccount"  with attributes such as account number and balance,
  and abstract methods called "deposit" and "withdraw".Create a subclass called "CheckingAccount" that    
  inherits from BankAccount and implements the  "deposit" and "withdraw" methods. Create an object  
  of the CheckingAccount class and call both the "deposit" and "withdraw" methods.
 */



package Thursday_13th_july;
import java.util.Scanner;

public   abstract class Bank_account_Q1 {
	
	//declare variables class level
		int accountNumber, check_pin, credit, debit;
		static char repeat;
		static int choice;
	    private int balance=2000, pinno=90044;

	    static Scanner sc = new Scanner(System.in);


	    // abstract method deposite and withdraw
		abstract void deposit();

		abstract void withdraw();



		// getter setter methods for private members
		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		public int getPinno() {
			return pinno;
		}

		public void setPinno(int pinno) {
			this.pinno = pinno;
		}


}
