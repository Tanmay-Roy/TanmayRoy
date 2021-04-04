package Lab1;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int n=sc.nextInt();
		Exercise5 obj=new Exercise5();
		int sum=obj.calculateSum(n);
		System.out.println("the sum is: "+sum);
	}
	public int calculateSum(int n)
	{
		int sum=0;
		for (int i=0;i<=n;i++)
		{
			if (i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
