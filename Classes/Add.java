package Classes;

public class Add {
	
	   int x;
	    int y;
	    
	 int calculateSum()
	 {
	     int sum=x+y;
	     return sum;
	 }
	 
	 public String toString()
	 {
	     return "X="+x+"Y=:"+y+"Sum=:"+calculateSum();
	 }
	}