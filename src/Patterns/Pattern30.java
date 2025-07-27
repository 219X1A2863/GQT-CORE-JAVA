package Patterns;
import java.util.Scanner; 
public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of rows for the top half
        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Print ascending numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            // Print descending numbers
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Print ascending numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            // Print descending numbers
            for (int z = i - 1; z >= 1; z--) {
                System.out.print(z + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

