package accesspecifire;

public class Employee {
	
		private int id;
		private String name;
	private	float salary;
		
		
		Employee(int i,String j,float k)//i=1001,j="Akshay" k=45000
		{
			id=i;//1001
			name=j;//Akshay
			salary=k;//45000
		}
		double annualsalary()
		{
			double annualsalary=salary*12;
			return annualsalary;
		}

		
		public String toString()
		{
			return "ID=:"+id+"Name=:"+name+"Salary=:"+salary+"AnnualSalary"+annualsalary();
		}
	}
}
