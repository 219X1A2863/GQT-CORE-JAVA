package Patterns;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print("  ");
			}
			for(int z=1;z<=2*i-1;z++)
			{
				System.out.print(z+" ");
			}
			System.out.println();
		}
		sc.close();


	}

}
