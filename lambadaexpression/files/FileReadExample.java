package files;

		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;

		public class FileReadExample {

			public static void main(String[] args) throws FileNotFoundException {
				FileInputStream fin=new FileInputStream("d:/A.txt");
				
				try {
					int i = 0;
					while(i!=-1)
					{
					i=fin.read();
					System.out.println((char)i);
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}



