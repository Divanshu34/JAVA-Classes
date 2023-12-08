package com.sunbeam.a_methods;

import java.util.Scanner;

public class AFirstMethod {
	

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year = s.nextInt();
//		char x = 'a';
		boolean x = isLeapYear(year);
		System.out.println(x);
		
		if(x == true) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a leap year");
		}
		
		System.out.println("Enter the week no");
		int weekNo = s.nextInt();
		String weekName = numberToWeekName(weekNo);
		
		System.out.println("Your week no represents "+weekName);
	}
	
	
	public static String numberToWeekName(int weekNo) {
		if(weekNo == 0) {
//			System.out.println("Monday");
			return "Monday";
		} else if(weekNo == 1) {
			return "Tuesday";
		} else if(weekNo == 2) {
			return "Wednesday";
		} else if(weekNo == 3) {
			return "Thursday";
		} else if(weekNo == 4) {
			return "Friday";
		} else if(weekNo == 5) {
			return "Saturday";
		} else if(weekNo == 6) {
			return "Sunday";
		} else {
			return "Please correct number";
		}
		
//		etskhnblkddneb
//		bdnjn
	}
	
	public static boolean isLeapYear(int x) { //x = year-> 1996
		if(x % 400 == 0) {
//			System.out.println("Leap year");
			return true;
		} else if(x % 100 != 0 && x % 4 == 0) {
//			System.out.println("Leap year");
			return true;
		} else {
//			System.out.println("Not a leap year");
			return false;
		}
	}
	
	

}
