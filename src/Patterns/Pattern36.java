package Patterns;
import java.util.Scanner;
public class Pattern36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Print characters with space
            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}


 