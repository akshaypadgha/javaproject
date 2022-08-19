package Constructor;

public class Product {
	
		int id;
		String name;
		int noofproducts;
		
		Product()
		{
			
		}
		Product(int i,String j,int k)//i=1001,j=chair k=45
		{
			id=i;//1001
			name=j;//chair
			noofproducts=k;//45
		}
		
		public String toString()
		{
			return "Product id=: "+id+"Product name =:"+name+"Number of products=:"+noofproducts;
			
		}

	}


