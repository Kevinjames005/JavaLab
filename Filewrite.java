package p2;
import java.io.*;

public class Filewrite {
	public static void main(String [] args) {
		try {
		FileInputStream fin = new FileInputStream("filename1.txt");
		FileOutputStream fout = new FileOutputStream("filename2.txt");
		int i ;
		while((i=fin.read()) !=-1) {
			fout.write(i);
		}
		System.out.println("Successfully write to the specified file");
		fin.close();
		fout.close();
		
	}
		catch(FileNotFoundException e){
			System.out.println("File not Found Exception,"+ e.getMessage());
		}
		catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		}
	
	}
}
