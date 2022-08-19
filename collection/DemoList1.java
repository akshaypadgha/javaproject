package collection;
import java.util.ArrayList;

public class DemoList1 {

		public static void main(String[] args) {
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.add(12);
			list.add(34);
			list.add(38);
			list.add(90);
			list.add(78);
			list.add(78);
			list.add(2,96);
			System.out.println(list);
			list.remove(5);
			System.out.println(list);
			ArrayList<Float> list1=new ArrayList<Float>();
			list1.add(34.5f);
			list1.add(24.9f);
			list1.add(14.6f);
			list1.add(94.8f);
			list1.add(44.3f);
			System.out.println(list1);
			
			System.out.println(list.size());
			System.out.println(list.contains(190));
			System.out.println(list.isEmpty());
			ArrayList<Integer> second=new ArrayList<Integer>();
		second=(ArrayList)list.clone();
		System.out.println(second);
		for(Integer i:list)
		{
			System.out.println(i);
		}
			
			
			

		}

	}


