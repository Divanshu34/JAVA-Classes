package com.sunbeam.a_conditionals;

import java.util.Scanner;

public class BLeapYear {

	public static void main(String[] args) {
		// 4. if century year % 400 == 0

		// 1. take input from user of year
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year you want to check");

		// 2. int year;
		int year = s.nextInt();

		// 3. year % 4 == 0
		// 2004 % 4 -> 0 == 0 -> true
		if (year % 400 == 0) {
			// year % 4 -> ans == 0 ans -> 4, 3,2,1,0,etc...
			System.out.println("Leap year");

		} else if (year % 100 != 0 && year % 4 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}

	}

}
