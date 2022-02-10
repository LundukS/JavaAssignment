package javaAssignments;

import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in); // using static I can use sc anywhere in my app
	final static private int bonda_price = 15;
	final static private int dosa_price = 15;
	final static private int idly_price = 15;
	final static private int bill_price = 15;
	

	static void bonda() {
		System.out.println("Enter the number of plates: ");
		int plate_num = sc.nextInt();
		int total_bill = bonda_price * plate_num;
		System.out.println("Your total is: " + total_bill);
		

	}

	static void dosa() {
		System.out.println("Enter the number of plates: ");
		int plate_num = sc.nextInt();
		int total_bill = dosa_price * plate_num;
		System.out.println("Your total is: " + total_bill);

	}

	static void idly() {
		System.out.println("Enter the number of plates: ");
		int plate_num = sc.nextInt();
		int total_bill = idly_price * plate_num;
		System.out.println("Your total is: " + total_bill);

	}

	static void bill() {
		System.out.println("Enter the number of plates: ");
		int plate_num = sc.nextInt();
		int total_bill = bill_price * plate_num;
		System.out.println("Your total is: " + total_bill);

	}

	static void exit() {
		Menu.main(null);

	}

	

	public static void main(String[] args) {
		
		System.out.println("==================================================");
		System.out.println("1. BONDA");
		System.out.println("2. DOSA");
		System.out.println("3. IDLY");
		System.out.println("4. BILL");
		System.out.println("5. EXIT");
		System.out.println("==================================================");
		// ----------------------------------------------------------------------------------//
		System.out.println("Enter the item no. : ");
		int item_num = sc.nextInt();

		switch (item_num) {
		case (1):
			bonda();
			break;
		case (2):
			dosa();
			break;
		case (3):
			idly();
			break;
		case (4):
			bill();
			break;
		case (5):
			exit();
			break;
		default:
			System.out.println("Enter a number between 1 and 5. Thank you.");

		}
		

	
	}

}
