package variableanddatatype;

public class CharArrayToString {

	public static void main(String[] args) {
	char ch[]= {'a','b','c'};
	String s1=String.copyValueOf(ch);
	System.out.println("s1 value:"+s1);
	String s2=new String(ch);
	System.out.println("s2 value:"+s2);
	

	}

}
