package designnpattern;

public class PlanMainDemo {

	public static void main(String[] args) {
		DomesticPlan d=new DomesticPlan();
		d.getRate();
		d.calculateBill(34);
		CommercialPlan d1=new CommercialPlan();
		d1.getRate();
		d1.calculateBill(39);
		InstitutionalPlan i=new InstitutionalPlan();
		i.getRate();
		i.calculateBill(90);
		

	}

}


	
