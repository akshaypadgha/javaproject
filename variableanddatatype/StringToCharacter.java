package variableanddatatype;
import java.util.Scanner;

public class StringToCharacter {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Name");
     String Name=sc.next();
     char a[]=Name.toCharArray();
     System.out.println(a[0]);
     System.out.println(a[1]);
     System.out.println(a[2]);
     System.out.println(a[3]);
     System.out.println(a[4]);
	}

}
