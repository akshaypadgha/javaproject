package variableanddatatype;
import java.util.Scanner;


public class Speed {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("What Is The Speed You Are Calculate");
		int speed = sc.nextInt();
		
		 System.out.print("What is The Distance You Are Calculate");
		 int distance =sc.nextInt();
		float time = (float)distance/speed;
		System.out.println("Your Given Calculate time is :"+time);
		

	} 
}
