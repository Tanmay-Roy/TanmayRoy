package day4;

import java.util.Scanner;

public class HRSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter project name: ");
		String a=sc.nextLine();
		System.out.println("enter employee name: ");
		String b=sc.nextLine();
		System.out.println("enter employee id: ");
		int c=sc.nextInt();
		System.out.println("enter experience in years of the employee: ");
		int d=sc.nextInt();
		Employee e=new Employee(c,b,a,d);
		e.workingOnProject();
	}

}
