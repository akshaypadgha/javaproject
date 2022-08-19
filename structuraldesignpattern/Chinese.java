package structuraldesignpattern;

	public class Chinese extends FoodDecorator
	{

		public Chinese(Food newfood) {
			super(newfood);
			// TODO Auto-generated constructor stub
		}
		@Override
		public String preparingfood() {
			
			return newfood.preparingfood()+"noodles";
		}

		@Override
		public float pricefood() {
			// TODO Auto-generated method stub
			return newfood.pricefood()+900.8f;
		}

	}


