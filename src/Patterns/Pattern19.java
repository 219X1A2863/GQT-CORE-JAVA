package Patterns;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		sc.close();

	}

}
