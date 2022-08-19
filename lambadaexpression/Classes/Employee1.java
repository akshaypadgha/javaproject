package Classes;

public class Employee1 {

		int id;
		String name;
		float salary;
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

