package files;

		import java.io.FileOutputStream;
		import java.io.FileWriter;
		import java.io.IOException;
		import java.io.ObjectOutputStream;
		import java.io.OutputStream;

		public class EmployeeMain {

			public static void main(String[] args) throws IOException {
				Employee emp=new Employee(1001,"gayathri",345000);
				Employee emp1=new Employee(1002,"Ravi",565000);
				Employee emp2=new Employee(1003,"kavi",905000);
				FileOutputStream fw=new FileOutputStream("output.txt");
				ObjectOutputStream obj=new ObjectOutputStream(fw);
				obj.writeObject(emp);
				obj.writeObject(emp1);
				obj.writeObject(emp2);
		       obj.close();
		       System.out.println("write the object completed");

			}

		}


	
