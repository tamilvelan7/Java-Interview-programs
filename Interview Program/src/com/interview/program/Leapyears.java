package com.interview.program;

import java.util.Scanner;

public class Leapyears {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year :");
		int year=sc.nextInt();
		if((year%400==0) || (year%100!=0 && year%4==0)) {
			System.out.println(year+" is leap years");
		}
		else {
			System.out.println(year+" is not leap years");
		}

	}

}
