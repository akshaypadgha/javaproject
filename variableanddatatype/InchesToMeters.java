package variableanddatatype;
import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Inches:");
double inch = sc.nextDouble();
Object meter = inch * 0.0254;
System.out.println(inch + "Inch is" +meter + "1meter");

	}

}
