package Arrays;

public class MobileMain {

	public static void main(String[] args) {
		Mobile vivo=new Mobile();
		vivo.ram=8;
		vivo.rom=128;
		vivo.color="black";
		vivo.os="snapdragon";
		System.out.println(vivo.ram);
		System.out.println(vivo.rom);
		System.out.println(vivo.color);
		System.out.println(vivo.os);
		vivo.communication();
		vivo.Browsing();
	
	}		

}
