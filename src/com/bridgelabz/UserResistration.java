package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserResistration {
	Scanner sc = new Scanner(System.in);

	public void firstNameCheck() {
		System.out.print("Enter First Name of User: ");
		String fName = sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
		if (check)
			System.out.println("It is a FirstName");
		else
			System.out.println("Please Enter a Valid First Name");
	}

	public static void main(String[] args) {
		UserResistration user = new UserResistration();
		System.out.println("Welcome to User Registration Program");
		user.firstNameCheck();
	}

}
