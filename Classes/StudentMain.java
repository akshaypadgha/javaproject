
package Classes;

public class StudentMain {

	public static void main(String[] args) {
		
				Student s1=new Student();
				s1.sId=01;
				s1.sName="Akshay";
				s1.m1=89;
				s1.m2=80;
				s1.m3=78;
				s1.m4=76;
				s1.m5=67;
				System.out.println("Student sid=:"+s1.sId);
				System.out.println("Student sName=:"+s1.sName);
				System.out.println("Student m1=:"+s1.m1);
				System.out.println("Student m2=:"+s1.m2);
				System.out.println("Student m3=:"+s1.m3);
				System.out.println("Student m4=:"+s1.m4);
				System.out.println("Student m5=:"+s1.m5);
				s1.percentage();
				System.out.println("");
				Student s2=new Student();
				s2.sId=02;
				s2.sName="Agar";
				s2.m1=67;
				s2.m2=80;
				s2.m3=75;
				s2.m4=79;
				s2.m5=67;
				System.out.println("Student sid=:"+s2.sId);
				System.out.println("Student sName=:"+s2.sName);
				System.out.println("Student m1=:"+s2.m1);
				System.out.println("Student m2=:"+s2.m2);
				System.out.println("Student m3=:"+s2.m3);
				System.out.println("Student m4=:"+s2.m4);
				System.out.println("Student m5=:"+s2.m5);
				s2.percentage();
				System.out.println("");

	}

}
