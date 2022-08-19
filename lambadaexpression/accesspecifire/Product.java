package accesspecifire;

public class Product {
	
		
		private	int id;
		private	String name;
		private	int noofproducts;

		{
		
		}
		public	Product()
			{
				
			}
	public Product(int id,String name,int noofproduct)//i=1001,j=chair k=45
			{
		this.id=id;//1001
		this.name=name;//chair
			this.noofproducts=noofproduct;//45
			}
			
			public String toString()
			{
				return "Product id=: "+id+"Product name =:"+name+"Number of products=:"+noofproducts;
				
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getNoofproducts() {
				return noofproducts;
			}
			public void setNoofproducts(int noofproducts) {
				this.noofproducts = noofproducts;
			}

		}




