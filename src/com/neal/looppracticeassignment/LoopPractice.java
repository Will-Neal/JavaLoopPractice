package com.neal.looppracticeassignment;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
//		printMultiplicationTable();
//		findGreatestCommonDivisor();
		predictFutureTuition();

	}
	
	static void printMultiplicationTable() {
		for (int row = 1; row<=12; row++) {
			for (int column = 1; column <=12; column++) {
				int product = row * column;
				System.out.print(product + "  ");
			}
			System.out.println();
		}
	}
	
	static void findGreatestCommonDivisor() {
		Scanner userScan = new Scanner (System.in);
		System.out.println("Enter two numbers to find Greatest Common Divisor. ");
		int x = userScan.nextInt();
		int y = userScan.nextInt();
		if (x >= y) {
			for (int i = x; i > 0; i--) {
				if ( x%i==0 && y%i==0) {
					System.out.println("The Greatest Common Divisior is: " + i);
					break;
				} else {
					continue;
				}
			}
		} else {
			for (int i = y; i > 0; i--) {
				if ( x%i==0 && y%i==0) {
					System.out.println("The Greatest Common Divisior is: " + i);
					break;
				} else {
					continue;
				}
			}
		}
		userScan.close();
	}
	
	static void predictFutureTuition() {
		double tuition = 10000;
		double tuitionCount = tuition;
		int years =  0;
		while (tuitionCount < (tuition * 2)) {
			years++;
			tuitionCount = 1.07 * tuitionCount;
		}
		System.out.printf("The tuition will double in %s years", years);
	}

}
