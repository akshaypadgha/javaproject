package collection;

		import java.util.ArrayList;

		public class ArrayListDemo {

			public static void main(String[] args) {
				ArrayList<Character>list=new ArrayList<Character>();
				list.add('h');
				list.add('k');
				list.add('j');
				System.out.println(list);
				
				ArrayList<Character>list1=new ArrayList<Character>();
				list1.add('r');
				list1.add('k');
				list1.add('j');
				System.out.println(list1);
				System.out.println("=====================after");
			list.retainAll(list1);
				System.out.println(list);
				

			}

		}



