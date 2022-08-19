package files;


		import java.io.FileWriter;
		import java.io.IOException;

		public class WriteExample {

			public static void main(String[] args) throws IOException {
				FileWriter fw=new FileWriter("B.txt");
				fw.write("WelocmetoJava");
		        fw.close();
		        System.out.println("created");
			}

		}


	
