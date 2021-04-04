package Lab1;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean poweroftwo=false;
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		Exercise8 obj=new Exercise8();
        poweroftwo=obj.checkNumber(n);
        if (poweroftwo)
        {
        	System.out.println("the input is a power of two");
        }
        else
        {
        	System.out.println("the input is not a power of two");
        }
	}
	public boolean checkNumber(int n)
	{
		while (n%2==0)
		{
			n=n/2;
		}
		if (n==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}