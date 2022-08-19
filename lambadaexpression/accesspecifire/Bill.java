package accesspecifire;

	public class Bill 
	{
		private int billNumber;
		private int noofunits;
		private int costperunit;
		public Bill()
		{
			
		}
		public Bill(int billNumber,int noofunits,int costperunit)
		{
			this.billNumber=billNumber;
			this.noofunits=noofunits;
			this.costperunit=costperunit;
		}
		public double calculateBill()
		{
			return noofunits*costperunit;
		}
		@Override
		public String toString() {
			return "Bill [billNumber=" + billNumber + ", noofunits=" + noofunits + ", costperunit=" + costperunit
					+ ", calculateBill()=" + calculateBill() + "]";
		}
		
			
		}
		

	

