package variableanddatatype;

import java.util.Scanner;

public class swap{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before"+a);
		System.out.println("Before"+b);
		a=a+b ;
		b=a-b;
		a=a-b;
		System.out.println("After"+a);
		System.out.println("After"+b);

	}

}


