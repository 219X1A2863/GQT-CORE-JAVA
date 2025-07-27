package Patterns;

import java.util.Scanner;

public class Pattern42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces (each " " counts for 2 to align with "A ")
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Increasing part: A to current row character
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            // Repeat again: A to one less than current row character
            for (char ch = 'A'; ch < 'A' + i - 1; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
