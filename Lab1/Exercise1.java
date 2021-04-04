package Lab1;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		Exercise1 obj=new Exercise1();
		int sum=obj.method(n);
		System.out.println("the sum of the cubes of individual digits are: "+sum);
	}
	public int method(int n)
	{
		int sum=0;
		int r=0;
		while (n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		}
		return sum;
	}

}
