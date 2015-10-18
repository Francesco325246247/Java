import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main {

	public static void main(String[] args) {

		
		
		File file = new File("test.txt");
		
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			
			System.out.println("Your computer will be formatted in 3, 2, 1 ... just kidding: File not found. " +file );
			
		}
		
		
		
	}

}
