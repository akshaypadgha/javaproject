package variableanddatatype;
import java.util.Scanner;

public class Userpass {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	        System.out.println("enter the username and password");
	        String username=sc.next();
	        String password=sc.next();
	      System.out.println(username.equals("akshay"));
	      System.out.println(password.equals("123456789"));
		}

	}
