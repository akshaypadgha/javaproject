package structuraldesignpattern;

	public abstract class FoodDecorator implements Food
	{
	Food newfood;
	public FoodDecorator(Food newfood)
	{
		this.newfood=newfood;
	}
		@Override
		public String preparingfood(String foodname) {
			
			return foodname;
		}

		@Override
		public float pricefood(float price) {
			// TODO Auto-generated method stub
			return price;
		}
		

	}


