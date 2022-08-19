package Classes;

	public class LaptopMain {

		public static void main(String[] args) {
			Laptop asus=new Laptop();
			asus.ram=8;
			asus.rom=64;
			asus.processor="i5";
			asus.os="snapdragon";
			System.out.println("The Ram=:"+asus.ram);
			System.out.println("The Rom=:"+asus.rom);
			System.out.println("Processor=:"+asus.processor);
			System.out.println("Os=:"+asus.os);
			asus.communication();
			asus.Browsing();

		}

	}

