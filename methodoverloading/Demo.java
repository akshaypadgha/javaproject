package methodoverloading;

public class Demo {
		
		void display()//without return type and without  parameter
		{
			System.out.println("hello");
		}
		String display1()//with return type and without  parameter
		{
			return "hello";
		}
		
		void display2(String s)//without return type with parameter
		{
			System.out.println(s);
		}


	}
