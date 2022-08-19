
		package methodref;

		import java.util.function.BiFunction;

		public class AddtionExample {

			public static void main(String[] args) {
				BiFunction<Integer, Integer, Double>bi=AddtionExample::add;
				
		             System.out.println(bi.apply(23, 90));
		            
			}
			
			public static double add(int x,int y)
			{
				double d=x+y;
				return d;
			}

		}


	
