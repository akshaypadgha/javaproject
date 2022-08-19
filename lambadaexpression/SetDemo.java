
		package lambadaexpression;

		import java.util.HashSet;

		public class SetDemo {

			public static void main(String[] args) {
				HashSet<String>set=new HashSet<String>();
				set.add("java");
				set.add("c++");
				set.add("j2ee");
				set.add("python");
				set.forEach(System.out::println);
				

			}


	}


