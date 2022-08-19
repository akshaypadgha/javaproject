
		package streamexample;

		import java.util.Arrays;
		import java.util.List;
		import java.util.Optional;

		public class StreamReduceMethod {

			public static void main(String[] args) 
			{
			List<String>list=Arrays.asList("java","c++","c","python","datascience");
			 Optional<String> longestString = list.stream()
		             .reduce((word1, word2)
		       -> word1.length() > word2.length()
		                     ? word1 : word2);

		// Displaying the longest String
		//longestString.ifPresent(s->System.out.print(s));
			longestString.ifPresent(System.out::println);



			}

		}

	
