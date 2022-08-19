
		package streamexample;

		import java.util.Arrays;
		import java.util.List;
		import java.util.stream.Collector;
		import java.util.stream.Collectors;
		import java.util.stream.Stream;

		public class StreamCollectorExample {

			public static void main(String[] args) {
				List<Integer>list=Arrays.asList(3,4,5,6,7,8);
				Stream <Integer>s=list.stream();
				List evennumberlist=s.filter(i->i%2==0).collect(Collectors.toList());
				System.out.println(evennumberlist);
				System.out.println("==========================");
				System.out.println(list);

			}

		}

	

