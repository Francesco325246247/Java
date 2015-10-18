
package login;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		Login login = new Login();

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name1 = scanner1.nextLine();
		System.out.println("Please Enter your password");
		String password1 = scanner1.nextLine();

		if (login.validateUser(name1, password1) == true) {

			if (name1.equals("Marina")) {
				Account Marina = new Account();
				Marina.deposit(200000.000);
				System.out.println("Welcome " + name1 + " You have been authenticated");
				System.out.println(Marina.getBalance());
				System.out.println("Menu");
				System.out.println("1 Withdraw");
				System.out.println("2 Deposit");
				System.out.println("3 Transfer");
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("Please select one option");
				int i = scanner2.nextInt();
				if(i == 1){
					System.out.println("Please select the ammount to withdraw");
					int a = scanner2.nextInt();
					Marina.withdraw(a);
					System.out.println("You withdrawed "+ a + " "+Marina.getBalance() );
				}if(i == 2){
				System.out.println("Please select the ammount to deposit");
				int a = scanner2.nextInt();
				Marina.deposit(a);
				System.out.println("You deposited "+ a + " "+Marina.getBalance() );
			
				
				}
			}
			if (name1.equals("Francesco")) {
				Account Francesco = new Account();
				Francesco.deposit(300000.000);
				System.out.println("Welcome " + name1 + " You have been authenticated");
				System.out.println(Francesco.getBalance());
			}
		} else {

			System.out.println("Connection Terminated, contact your system administrator");
		}

	}

}