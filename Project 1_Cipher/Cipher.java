
//**************************************************************************************
//
// Cipher.java		Author: White, Joshua-Josef
// CPSC 50100: "Programming Fundamentals" , Section 002
// Summer 2020
// Programming Assignment 1
// 
// Program allows the user to encode the sum of 5 user-entered numbers, using the Caesar code
//
//**************************************************************************************

import java.util.Scanner;
import java.util.Random;

public class Cipher {

	public static void main(String[] args) {
	
		int num1, num2, num3, num4, num5;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("To begin encoding, please enter 5 integers"
				+ " between 0 and 19");
		
		System.out.print("Please enter the first number: ");
		num1 = scan.nextInt();
	
		if ((num1 < 0) || (num1 > 19))
			{System.out.println("Please read directions and try again!");
			System.exit(0);}
	// if a number outside the range is entered, the program
	// generates an error message and terminates
		else System.out.print("Please enter the second number: ");
		num2 = scan.nextInt();
	// if an acceptable number is entered, the value is stored
	// and the program continues
		if ((num2 < 0) || (num2 > 19))
		{System.out.println("Please read directions and try again!");
		System.exit(0);}
		
		else System.out.print("Please enter the third number: ");
		num3 = scan.nextInt();
		
		if ((num3 < 0) || (num3 > 19))
		{System.out.println("Please read directions and try again!");
		System.exit(0);}
		
		else System.out.print("Please enter the fourth number: ");
		num4 = scan.nextInt();
		
		if ((num4 < 0) || (num4 > 19))
		{System.out.println("Please read directions and try again!");
		System.exit(0);}
		
		else System.out.print("Please enter the fifth number: ");
		num5 = scan.nextInt();
		
		if ((num5 < 0) || (num5 > 19))
		{System.out.println("Please read directions and try again!");
		System.exit(0);}
		
		else System.out.println("Numbers have been stored, encoding will now continue");
		// if all numbers have been entered appropriately, the program
		// will display confirmation txt to the user before continuing
		int plaintext;
		plaintext = (num1 + num2 + num3 + num4 + num5);
		// the sum of all 5 numbers will be stored as the plaintext
		Random generator = new Random();
		int key;
		key = generator.nextInt (10); // generates the encoding key as an integer from 0-9
		System.out.println("The encoding key is " + key);
		
		int tens, ones;
		tens = (plaintext / 10);
		ones = (plaintext % 10);
		// separates the resulting sum into tens and ones to encode each digit separately
		int encode1, encode2;
		encode1 = ((tens + key) % 10);
		encode2 = ((ones + key) % 10);
		// the individual digits are encoded using the Caesar code
		System.out.println("The encoded number is " + encode1 + encode2);
		// the program will take the individual digits and combines into the encoded number
		scan.close();
		
	
			
			}

}
