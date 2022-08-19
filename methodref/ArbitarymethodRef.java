 
		package methodref;

		import java.util.Arrays;

		public class ArbitarymethodRef {

			public static void main(String[] args) {
				String arr[]= {"java","c++","c","python"};
				
				Arrays.sort(arr,String::compareToIgnoreCase);
				for(String s:arr)
				{
					System.out.println(s);
				}

			}

		}

	
