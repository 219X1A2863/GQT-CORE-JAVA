package Patterns;

import java.util.Scanner;

public class Pattern38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        
        char ch = 'A';
        
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Calculate starting character for the row
            char startChar = (char) ('A' + (2 * i - 2));

            // Print decreasing characters
            for (char c = startChar; c >= 'A'; c--) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
        
        sc.close();
    }
}
