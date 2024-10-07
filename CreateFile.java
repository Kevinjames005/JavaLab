package p2;

import java.io.*;

public class CreateFile {
	public static void main(String [] args) {
		try {
			File obj = new File("filename2.txt");
			if(obj.createNewFile()) {
				System.out.println("File Created:"+ obj.getName() + obj.getAbsolutePath());
			}
			else {
				System.out.println("File already exists.");
			}
		}
		catch(IOException e){
			System.out.println("An error occured." );
			e.printStackTrace();
			
		}
	}
}
