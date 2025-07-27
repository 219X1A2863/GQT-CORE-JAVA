package Patterns;

import java.util.Scanner;

public class Pattern40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int space = 1; space <= n - i - 1; space++) {
                System.out.print(" ");
            }
            // Get starting character
            char ch = (char) ('A' + i);

            // Print decreasing characters from ch to 'A'
            for (char j = ch; j >= 'A'; j--) {
                System.out.print(j);
            }

            // Print increasing characters from 'B' to ch
            for (char j = 'B'; j <= ch; j++) {
                System.out.print(j);
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}
