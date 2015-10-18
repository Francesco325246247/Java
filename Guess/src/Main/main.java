package Main;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class main {

	public static void main(String[] args) {

		int magicNumber = (int) (Math.random() * 100);

		int guess;
		Scanner sc = new Scanner(System.in);
	
		
		for (guess = 0; guess <= 7; guess++) {
			System.out.println("Guess the ?magic.... number");
			int a = sc.nextInt();
			if (magicNumber > a) {
				System.out.println("The magic number is an higher number ");
			}
			if (magicNumber < a) {
				System.out.println("The magic number is a smaller number ");
			} if (magicNumber == a){
				System.out.println("You win 8====D the Magic Number is exactly " + magicNumber);
			}
		}
		;
		System.out.println("You ran out of luck :'( , the magic number was " + magicNumber);
	}
}
