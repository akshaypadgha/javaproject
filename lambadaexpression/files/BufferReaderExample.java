package files;

		import java.io.BufferedReader;
		import java.io.FileNotFoundException;
		import java.io.FileReader;
		import java.io.IOException;

		public class BufferReaderExample {

			public static void main(String[] args) throws IOException {
				FileReader fr=new FileReader("d:/student.csv");
				BufferedReader br=new BufferedReader(fr);
				String col=br.readLine();
				System.out.println(col);
				
				
			}

		}


	
