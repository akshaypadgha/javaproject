package ConditionalStatements;

public class maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		import java.util.Scanner;

		       Scanner sc=new Scanner(System.in);
		       System.out.println("enter the three inputs");
		       int a=sc.nextInt();
		       int b=sc.nextInt();
		       int c=sc.nextInt();
		       if((a>b)&& (a>c))//2>4 && 2>5
		       {
		           System.out.println("The Max value is=:A"+a);
		       }
		       else if(b>c)//4>5
		       {
		           System.out.println("The Max value =:B"+b);
		       }
		       else
		       {
		           System.out.println("The Max value is=:C"+c);//5
		       }

		    }

		}

	}

}
