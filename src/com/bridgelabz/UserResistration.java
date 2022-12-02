package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserResistration {
	public void passWordRule1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password :  ");
		String passWord = sc.nextLine();
		boolean check = Pattern.matches("[a-zA-Z]{8,}", passWord);
		if (check)
			System.out.println("Is a valid Password");
		else
			System.out.println("Please Enter a Valid password, it should have minimum 8 characters");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserResistration user = new UserResistration();
		System.out.println("Welcome to User Registration Program");
		user.passWordRule1();
	}
}