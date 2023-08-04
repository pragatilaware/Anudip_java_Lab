/*
 Write a program to implement the process of bank to accept the userdetails 
 (Bank name,Account type, ac No, User name , password, and also the transaction, loan process) and display the output
 */

package Thursday_13th_july;
import java.util.Scanner;

public class operation_bank_Q4 extends Bank_deatil_Q4 {
	// Main function for Bank_details class
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			operation_bank_Q4 obj = new operation_bank_Q4();
			obj.printdetails();
			obj.transaction();

		}
}
