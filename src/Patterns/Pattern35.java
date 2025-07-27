package Patterns;

import java.util.Scanner;

public class Pattern35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            // Print leading spaces for center alignment
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");  // Two spaces to match the width of numbers and space
            }

            // Print the number i, (2*i - 1) times
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i + " ");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}
