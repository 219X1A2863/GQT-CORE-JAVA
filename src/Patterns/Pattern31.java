package Patterns;
import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        // Upper half including middle
        for (int i = 1; i <= n; i++) {
            // Leading spaces (2 spaces per unit for visual centering)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // First number
            System.out.print(i);

            // Middle spaces
            if (i > 1) {
                int spaceCount = 4 * i - 4;
                for (int j = 1; j <= spaceCount; j++) {
                    System.out.print(" ");
                }
                // Second number
                System.out.print(i);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // First number
            System.out.print(i);

            // Middle spaces
            if (i > 1) {
                int spaceCount = 4 * i - 4;
                for (int j = 1; j <= spaceCount; j++) {
                    System.out.print(" ");
                }
                // Second number
                System.out.print(i);
            }

            System.out.println();
        }

        sc.close();
    }
}
