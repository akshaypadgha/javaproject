package Arrays;

public class ShallowCopytwoD {

	public static void main(String[] args) {
		int a[][]= {{1,1},{2,2}};
		/*a[0][0]=1;
		  a[0][1]
		  a[1][0]
		  a[1][1]; */
		int b[][]=a.clone();
		a[0][0]++;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;i<b.length;j++)
			{
				System.out.println(b[i][j]);
			}
	}

}
}
