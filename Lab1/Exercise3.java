package Lab1;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
	int a=1,b=1;
	int c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the upper limit: ");
	int n=sc.nextInt();
	System.out.println("the required fibonacci series is given by: ");
	System.out.println(a);
	System.out.println(b);
	while (c<=n)
	{
		c=a+b;
		System.out.println(c+" ");
		a=b;
		b=c;
	}
	}
}
