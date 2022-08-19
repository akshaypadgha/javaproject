
		package streamexample;

		import java.util.Arrays;
		import java.util.List;
		import java.util.stream.Stream;

		public class StreamOperations {

			public static void main(String[] args) {
			List<String>list=Arrays.asList("java","c++","c","python","Datascience");
			Stream<String>s=list.stream();
			s.filter(s1->s1.startsWith("D")).forEach(System.out::println);

			}

		}


