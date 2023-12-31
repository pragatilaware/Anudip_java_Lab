package Thursday_13th_july;
import java.util.Scanner;

public class checking_account_Q1  extends Bank_account_Q1{
	// Procedure run main function
		public static void main(String[] args) {
			checking_account_Q1  obj = new checking_account_Q1();

			do {
				System.out.println("\n1: Deposit... \n2: withdrawal...");

				System.out.println("\nEnter 1 or 2: ");
				choice = sc.nextInt();
				if (choice == 1) {
					obj.deposit();

				} else if (choice == 2) {
					obj.withdraw();
				} else {
					System.out.println("Sorry wrong selection.....");
				}

				System.out.println("Do you want another operation (y/n): ");
				repeat = sc.next().charAt(0);

			} while (repeat == 'y' || repeat == 'Y');

		}

		// bank details from user.
		public void details() {
			System.out.println("===========================================================");
			System.out.println("Enter Account number: ");
			accountNumber = sc.nextInt();
			System.out.println("Enter Pin number: ");
			check_pin = sc.nextInt();
		}

		// override method from abstract class Bank_account_Q1
		@Override
		void deposit() {
			details();

			if (getPinno() == check_pin) {
				System.out.println("\nEnter deposit amount: ");
				credit = sc.nextInt();

				setBalance(getBalance() + credit);
				System.out.println("\nYour balance is: " + getBalance() + " /-");

			} else {
				System.out.println("invalid pin number...");
			}

			System.out.println("==================================================");
		}

		// override method from abstract class Bank_account_Q1
		@Override
		void withdraw() {
			details();

			if (getPinno() == check_pin) {
				System.out.println("\nEnter withdrawal amount: ");
				debit = sc.nextInt();

				if (credit < getBalance()) {
					setBalance(getBalance() - debit);
					System.out.println("\nYour balance is: " + getBalance());
				} else {
					System.out.println("insufficient balance.....");
					System.out.println("Your balance is : " + getBalance() + "/-");
					withdraw();
				}

			} else {
				System.out.println("invalid pin number...");
			}

			System.out.println("==================================================");
		}

}
