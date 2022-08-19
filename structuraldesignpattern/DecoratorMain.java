package structuraldesignpattern;

	import java.util.Scanner;

	public class DecoratorMain {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the food choice");
			Food f;
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("veg food");
			  VegFood v =new VegFood();
			  v.preparingfood();
			  v.pricefood();
			  break;
			case 2:System.out.println("Nonveg food");
			  Food n=new NonVeg((Food) new VegFood());  
			  n.preparingfood();
			  n.pricefood();
			  break;
			case 3:System.out.println("chinnese food");
			 Food v1=new Chinese((Food) new VegFood());  
			  v1.preparingfood();
			  v1.pricefood();
			  break;
			   
			}

		}

	}

	
