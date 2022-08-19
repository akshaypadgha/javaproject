
		package streamexample;

		import java.util.ArrayList;
		import java.util.List;

		public class DemoWithoutStream {

			public static void main(String[] args) {
				List<String>list=new ArrayList<String>();
				list.add("java");
				list.add("c++");
				list.add("python");
				list.add("datascience");
				int count=0;
				for(String s:list)
				{
					if(s.length()<6)
					{
						count++;
					}
				}
				System.out.println("The lessthan 6 length"+count);
				

			}

		}


	
