package structuraldesignpattern;

	public class NonVeg extends FoodDecorator
	{

		public NonVeg(Food newfood) {
			super(newfood);
			// TODO Auto-generated constructor stub
		}
		@Override
		public String preparingfood() {
			
			return newfood.preparingfood()+"Chicken rice";
		}

		@Override
		public float pricefood() {
			// TODO Auto-generated method stub
			return newfood.pricefood()+458.8f;
		}
		

	}

