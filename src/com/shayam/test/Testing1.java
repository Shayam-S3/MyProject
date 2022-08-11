package com.shayam.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Testing1 {

	static String Name;
	static String AccountNumber;
	static String Balance;
	static String Pin;

	static Scanner sc = new Scanner(System.in);

	static Map<String, String> bankCustomers = new HashMap<String, String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 4) {
			System.out.println("1. Create Account");
			System.out.println("2. Check Balanace");
			System.out.println("3. Deposit Amount");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			i = sc.nextInt();
			bankApplication(i);
		}
	}

	public static void bankApplication(int i) {
		if (i == 1) {
			System.out.println("Enter your names for application");
			Name = sc.next();
			bankCustomers.put("Name", Name);
			bankCustomers.put("Account_Number", Name + "_" + "123");
			System.out.println("Enter your new pin number");
			Pin = sc.next();
			bankCustomers.put("Pin", Pin);
			bankCustomers.put("Balance", "0");
			System.out.println("Account successfully created");

		} else if (i == 2) {
			System.out.println("Enter your account number");
			String acc = sc.next();
			System.out.println("Enter your pin number");
			String pin_num = sc.next();
			if (bankCustomers.containsValue(pin_num) && bankCustomers.containsValue(acc)) {
				for (Map.Entry<String, String> entry : bankCustomers.entrySet()) {
					if (entry.getKey().equals("Balance")) {
						System.out.println("Your account balance " + entry.getValue());
					}
				}
			} else {
				System.out.println("Account not ");
			}
		} else if (i == 3) {
			System.out.println("Enter account number");
			String acc = sc.next();
			System.out.println("Enter Amount to Deposit");
			int amount = sc.nextInt();
			int bal = 0;
			if (bankCustomers.containsValue(acc)) {
				for (Map.Entry<String, String> entry : bankCustomers.entrySet()) {
					if (entry.getKey().equals("Balance")) {
						bal = Integer.valueOf(entry.getValue());
						amount = amount + bal;
						entry.setValue(String.valueOf(amount));
						System.out.println("Amount successfully deposited");
					}
				}
			} else {
				System.out.println("Account Not Found");
			}
		} else {
			System.out.println("Application Stopped");
		}

	}

}
