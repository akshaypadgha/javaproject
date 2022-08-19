
		package collection;

		import java.util.LinkedList;

		public class LinkedListDemo {

			public static void main(String[] args) {
				LinkedList<Integer>list=new LinkedList<Integer>();
				list.add(1001);
				list.add(1002);
				list.add(1003);
				list.add(1004);
				list.add(1005);
				list.add(1001);
				System.out.println(list);
				list.addFirst(1000);
				list.addLast(1006);
				System.out.println(list);

			}

		}


	
