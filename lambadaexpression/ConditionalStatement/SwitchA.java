
package ConditionalStatement;

import java.util.Scanner; 
public class SwitchA {

	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
			System.out.println("Enter the choise");
			int choise=sc.nextInt();
			System.out.println("Enter the second number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int result;
			switch(choise)
			{
			case 1:
				result=a+b;
				System.out.println("the sum =:"+result);
				break;
			case 2:
				result=a-b;
				System.out.println("the subtraction =:"+result);
				break;
			case 3:
				result=a*b;
				System.out.println("the mul =:"+result);
				break;
			case 4:
				result=a/b;
				System.out.println("the div=:"+result);
				break;
				default:
				System.out.println("doesnot match the choise");
				
			}
			
	}
	}