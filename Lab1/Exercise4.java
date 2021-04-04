package Lab1;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,j=0;
		System.out.println("enter the integer range upto which prime numbers are to be displayed: ");
		int n=sc.nextInt();
		System.out.println("the prime numbers are: ");
		for (i=2;i<=n;i++)
		{
			int c=0;
			for (j=1;j<=i;j++)
			{
				if (i%j==0)
				{
					c++;
				}
			}
		if (c==2)
			System.out.println(" "+i);
		}
	}	
}
