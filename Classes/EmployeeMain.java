package Classes;

public class EmployeeMain {

			public static void main(String[] args) {
				Employee e1=new Employee();
				e1.id=01;
				e1.name="Akshay";
				e1.salary=45000;
				System.out.println("The Employee id=:"+e1.id);
				System.out.println("The Employee Name=:"+e1.name);
				System.out.println("The Employee salary=:"+e1.salary);
				System.out.println("The Employee Annualsalary=:"+e1.annualsalary());
				System.out.println("===========================");
				Employee e2=new Employee();
				e2.id=02;
				e2.name="Abhay";
				e2.salary=78000;
				System.out.println("The Employee id=:"+e2.id);
				System.out.println("The Employee Name=:"+e2.name);
				System.out.println("The Employee salary=:"+e2.salary);
				System.out.println("The Employee Annualsalary=:"+e2.annualsalary());
				

			}

		}


	


