package Patterns;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("-"+" ");
			}
				for(int z=1;z<=i;z++)
				{
					System.out.print("#"+" ");
				}
			System.out.println();
		}
		sc.close();

	}

}
