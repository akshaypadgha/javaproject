           package loops;
            import java.util.Scanner;
            public class Reverse {

		    public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("enter the number");
		        int num=sc.nextInt();//567
		        int digit=0,rev=0;
		        while(num!=0)//567 56 5!=0 0==0
		        {
		            digit=num%10;//567%10=7 56%10=6 5%10=5
		            rev=(rev*10)+digit;//rev=0*10=0+7=7 rev=7*10=70+6=76
		            //rev=76*10=760+5=765
		            num=num/10;//567/10=56 56/10=5 0
		        }
		        System.out.println(rev);
		    }

		}

	


