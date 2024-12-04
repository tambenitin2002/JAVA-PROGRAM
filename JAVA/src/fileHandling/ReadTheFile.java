package fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadTheFile {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("D:\\PROGRAMMING\\Java\\Eclipse\\JAVA\\Packet\\fileHandling.txt");
//			System.out.println(fr.read()); // It will wittern the ASCI value
			int i;
			while((i=fr.read())!= -1) {
				System.out.print((char) i);
			}
			fr.close();
		}catch(IOException i) {
			System.out.println("File path is not match!!!");
		}

	}

}
