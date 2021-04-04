package day4;

import java.util.Scanner;

/* User Interaction */
public class StudentApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter school name: ");
		String d=sc.nextLine();
		System.out.println("enter student name: ");
		String b=sc.nextLine();
		System.out.println("enter student id: ");
		int a=sc.nextInt();
		System.out.println("class: ");
		int c=sc.nextInt();
		System.out.println("enter marks obtained in english: ");
		int e=sc.nextInt();
		System.out.println("enter marks obtained in project: ");
		int f=sc.nextInt();
		System.out.println("enter marks obtained in maths: ");
		int g=sc.nextInt();
		System.out.println("enter marks obtained in viva: ");
		int h=sc.nextInt();
		Student s=new Student(a,b,c,d,e,f,g,h);
		s.calculateMarks();
		
		
	}

}
