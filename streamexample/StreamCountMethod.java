
		package streamexample;

		import java.util.Arrays;
		import java.util.List;
		import java.util.stream.Stream;

		public class StreamCountMethod {

			public static void main(String[] args) {
				List<String>list=Arrays.asList("hai","hello","howru","welcome");
				long count= list.stream().filter(s->s.startsWith("h")).count();
				System.out.println(count);

			}

		}

	
