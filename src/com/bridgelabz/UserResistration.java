package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserResistration {
	public void passWordRule2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password :  ");
		String passWord = sc.nextLine();
		boolean check = Pattern.matches("[A-Z]{1}[a-z]{7,}", passWord);
		if (check)
			System.out.println("This Password is valid");
		else
			System.out.println("Please Enter a Valid password");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserResistration user = new UserResistration();
		System.out.println("Welcome to User Registration Program");
		user.passWordRule2();

	}
}
