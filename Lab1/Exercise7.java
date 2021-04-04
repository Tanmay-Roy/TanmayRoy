package Lab1;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean increasingnum=false;
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		Exercise7 obj=new Exercise7();
		increasingnum=obj.checkNumber(n);
		if (increasingnum)
		{
			System.out.println("increasing number");
		}
		else
		{
			System.out.println("not an increasing number");
		}	
	}
	public boolean checkNumber(int n)
	{
		boolean increasing=false;
		while(n>0)
		{
			int lastdigit=n%10;
			n=n/10;
			int secondlastdigit=n%10;
			if (secondlastdigit<=lastdigit)
			{
				increasing=true;
			}
			else
			{
				increasing=false;
				break;
			}
		}
		return increasing;
	}

}
