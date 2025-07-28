/**
 * 10
 */
package com.gqt.corejava.UniversalPatternsNumbers;

import java.util.Scanner;

/**
 * @author Vinay Reddy
 * @category Universal Pattern
 * @description Printing the Pattern Number 10
 */
public class PatternNumericNo10 {

	/**
	 * @param args
	 * @description This source code is for Printing Pattern Number 10
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program prints numbers from 1 to 9 using patterns.");
		System.out.print("Enter the size: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int num = 1; num <= 9; num++) {
				for (int j = 0; j < n; j++) {
					boolean print = false;

					// 1
					if (num == 1) {
						if (j == n / 2 || (i == 0 && j > 0 && j < n - 1) || (i == n - 1)) {
							print = true;
						}
					}
					// 2
				 else if (num == 2) {
						if (i == 0 || i == n - 1 || i == n / 2 || (i < n / 2 && j == n - 1) || (i > n / 2 && j == 0)) {
							print = true;
						}
					}
					// 3
					else if (num == 3) {
						if (i == 0 || i == n - 1 || i == n / 2 || j == n - 1) {
							print = true;
						}
					}
					// 4
					else if (num == 4) {
						if (j == n - 1 || i == n / 2 || (j == 0 && i < n / 2)) {
							print = true;
						}
					}
					// 5
					else if (num == 5) {
						if (i == 0 || i == n - 1 || i == n / 2 || (i < n / 2 && j == 0) || (i > n / 2 && j == n - 1)) {
							print = true;
						}
					}
					// 6
					else if (num == 6) {
						if (i == 0 || i == n - 1 || i == n / 2 || j == 0 || (i > n / 2 && j == n - 1)) {
							print = true;
						}
					}
					// 7
					else if (num == 7) {
						if (i == 0 || j == n - 1 || i == j) {
							print = true;
						}
					}
					// 8
					else if (num == 8) {
						if (i == 0 || i == n - 1 || i == n / 2 || j == 0 || j == n - 1) {
							print = true;
						}
					}
					// 9
					else if (num == 9) {
						if (i == 0 || i == n / 2 || j == n - 1 || (i < n / 2 && j == 0)) {
							print = true;
						}
					}

					System.out.print(print ? "# " : "  ");
				}
				System.out.print("\t"); // spacing between numbers
			}
			System.out.println();
		}
		sc.close();
	}
}
		






		




