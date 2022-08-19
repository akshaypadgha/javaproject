package collection;

		import java.util.ArrayList;

		public class EmployeeMain {

			public static void main(String[] args) {
				Employee emp1=new Employee(101,"Akshay",23000,"HYd");
				Employee emp2=new Employee(102,"Abhay",43000.5f,"CBE");
				Employee emp3=new Employee(103,"Rasika",45000,"Mumbai");
				ArrayList <Employee>list=new ArrayList<Employee>();
				list.add(emp1);
				list.add(emp2);
				list.add(emp3);
				System.out.println(list);
				
			}

		}


	


