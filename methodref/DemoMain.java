
		package methodref;

		public class DemoMain 
		{
			public void say()
			{
				System.out.println("welcome to edubridge");
			}
			public static void main(String[] args) 
			{
				DemoMain d1=new DemoMain();
				
				Demo d=d1::say;
				d.display();
				
			}

		}

	
