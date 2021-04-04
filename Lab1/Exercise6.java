package Lab1;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int n=sc.nextInt();
		Exercise6 obj=new Exercise6();
		int difference=obj.calculateDifference(n);
		System.out.println("the sum is: "+difference);
	}
	public int calculateDifference(int n)
	{
		int sum=0;
		int sum1=(n*(n+1))/2;
		int sum2=sum1*sum1;
		for (int i=1;i<=n;i++)
		{					
				sum=sum+i*i;			
		}
		return (sum-sum2);
	}
}
