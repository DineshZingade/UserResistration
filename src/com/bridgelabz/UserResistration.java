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
			System.out.println("Perfect! FirstName");
		else
			System.out.println("Please Enter a Valid First Name");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserResistration user = new UserResistration();
		System.out.println("Welcome to User Registration Program");
		user.firstNameCheck();
		user.lastNameCheck();
		user.email();
		user.mobileNum();
		user.passWordRule1();
		user.passWordRule2();
		user.passWordRule3();
		user.passWordRule4();
		user.emailUniversal("abc@yahoo.com");
		user.emailUniversal("abc-100@yahoo.com");
		user.emailUniversal("abc.100@yahoo.com");
		user.emailUniversal("abc111@abc.com");
		user.emailUniversal("abc-100@abc.net");
		user.emailUniversal("abc.100@abc.com.au");
		user.emailUniversal("abc@1.com");
		user.emailUniversal("abc@gmail.com.com");
		user.emailUniversal("abc+100@gmail.com.com");
	}

	public void lastNameCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Last Name of User: ");
		String lName = sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
		if (check)
			System.out.println("Perfect! LastName");
		else
			System.out.println("Please Enter a Valid Last Name");
	}

	public void email() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Email of User: ");
		String eMail = sc.next();
		boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", eMail);
		if (check)
			System.out.println("Perfect! Email!");
		else
			System.out.println("Please Enter a Valid Email");
	}

	public void mobileNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mobile number with country code (91)  : ");
		String mobileNum = sc.nextLine();
		boolean check = Pattern.matches("^91\\s[789][0-9]{9}", mobileNum);
		if (check)
			System.out.println("Perfect! Mobile Num");
		else
			System.out.println("Please Enter a Valid Mobile Number");
	}

	public void passWordRule1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password :  ");
		String passWord = sc.nextLine();
		boolean check = Pattern.matches("[a-zA-Z]{8,}", passWord);
		if (check)
			System.out.println("Perfect! #password");
		else
			System.out.println("Please Enter a Valid password, it should have minimum 8 characters");
	}

	public void passWordRule2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password :  ");
		String passWord = sc.nextLine();
		boolean check = Pattern.matches("[A-Z]{1}[a-z]{7,}", passWord);
		if (check)
			System.out.println("Perfect! password");
		else
			System.out.println("Please Enter a Valid passwor");
	}

	public void passWordRule3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password :  ");
		String passWord = sc.nextLine();
		boolean check = Pattern.matches("[A-Z]{1}[a-z]{6,}[0-9]{1}", passWord);
		if (check)
			System.out.println("Perfect! password");
		else
			System.out.println("Please Enter a Valid password");
	}

	public void passWordRule4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password :  ");
		String passWord = sc.nextLine();
		boolean check = Pattern.matches("[A-Z]{1}[a-z]{5,}[0-9]{1}[!@#$%^&*~]{1}", passWord);
		if (check)
			System.out.println("Perfect! password");
		else
			System.out.println("Please Enter a Valid password");
	}

	public void emailUniversal(String eMail) {
		boolean check = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", eMail);
		if (check)
			System.out.println("Perfect! Email!");
		else
			System.out.println("Please Enter a Valid Email");
	}
}