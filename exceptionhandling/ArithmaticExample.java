package exceptionhandling;

public class ArithmaticExample {

			public static void main(String[] args)
			{
				try
				{
				int a=5,b=0;
				int c=a+b;
				int sub=a-b;
				int product=a*b;
				System.out.println(c);
				System.out.println(sub);
				System.out.println(product);
				int div=a/b;
				
				System.out.println(div);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}

			}

		}


	
