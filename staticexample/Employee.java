package staticexample;

public class Employee {

	
	
		int id;
		String name;
		float salary;
		private static int idgen=1001;
		
		Employee()//default
		{
			id=idgen++;//1001
		}
		Employee(String j,float k)//i=1001,j="Akshay" k=45000
		{
			this();//default constructor
			name=j;//Akshay
			salary=k;//45000
		}
		public void setId(int id)
		{
			this.id=id;
		}
		public int getId()
		{
			return id;
		}
		double annualsalary()
		{
			double annualsalary=salary*12;
			return annualsalary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}

		
		

}
