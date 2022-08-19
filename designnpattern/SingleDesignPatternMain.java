package designnpattern;

		public class SingleDesignPatternMain {

			public static void main(String[] args) {
				//SingleObjectDemo s=new SingleObjectDemo();
				SingleObjectDemo s=SingleObjectDemo.getInstance();
				s.showMessage();

			}

		}


	
