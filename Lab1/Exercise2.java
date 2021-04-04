package Lab1;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice:");
		System.out.println("press 1 for red----press 2 for yellow----press 3 for green");
		int i=sc.nextInt();
		switch(i)
		{
		case 1:
				System.out.println("stop");
				break;
		case 2:
				System.out.println("ready");
				break;
		case 3:
				System.out.println("go");
				break;
		default:
			    System.out.println("wrong choice");
			    break;
		}
	}

}
