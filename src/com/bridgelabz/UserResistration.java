package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserResistration {
	public void mobileNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mobile number with country code (91)  : ");
		String mobileNum = sc.nextLine();
		boolean check = Pattern.matches("^91\\s[789][0-9]{9}", mobileNum);
		if (check)
			System.out.println("Perfect! Mobile Number");
		else
			System.out.println("Please Enter a Valid Mobile Number");
	}

	public static void main(String[] args) {
		UserResistration user = new UserResistration();
		System.out.println("Welcome to User Registration Program");
		user.mobileNum();
	}
}