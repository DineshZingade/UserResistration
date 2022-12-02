package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserResistration {
	public void lastNameCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Last Name of User: ");
		String lName = sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
		if (check)
			System.out.println("it is a LastName");
		else
			System.out.println("Please Enter a Valid Last Name");
	}

	public static void main(String[] args) {
		UserResistration user = new UserResistration();
		System.out.println("Welcome to User Registration Program");
		user.lastNameCheck();
	}
}
