package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class InsertDataIntoFile {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("D:\\\\PROGRAMMING\\\\Java\\\\Eclipse\\\\JAVA\\\\Packet\\\\fileHandling.txt");
			fw.write("Java Programming Tutorial file handling");
			fw.close();
			System.out.println("Data inserted successfully! ");
		}catch(IOException i){
			System.out.println("File path incorrected!!!!");
		}

	}

}
