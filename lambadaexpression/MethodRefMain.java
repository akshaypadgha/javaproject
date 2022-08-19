
		package lambadaexpression;

		public class MethodRefMain 
		{
			public void myMethod()
			{
				System.out.println("hello");
			}

			public static void main(String[] args) {
		      MethodRefMain m=new MethodRefMain();
		      MethodRefDemo d=m::myMethod;
		    
		      d.display();
		      

			}

		}

	
