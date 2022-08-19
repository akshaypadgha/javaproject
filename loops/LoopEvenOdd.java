package loops;
import java.util.Scanner;
public class LoopEvenOdd {
		

		public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);
		        System.out.println("enter the number");
		     int num=sc.nextInt();
		     int digit=0,evencount=0,addcount=0;
		     while(num!=0)
		     {
		    	 digit=num%10;
		    	 if(digit%2==0)
		    	 {
		    		 evencount++;
		    	 }
		    	 else
		    	 {
		    		 int oddcount = 0;
					oddcount++;
		    	 }
		    	 num=num/10;
		    	 System.out.println("odd count=:"+addcount);
		    	 System.out.println("even count=:"+evencount);
		     
		        
		        
		            
		     

		}

		}
}

