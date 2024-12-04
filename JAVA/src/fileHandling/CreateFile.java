package fileHandling;
import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File f1=new File("D:\\PROGRAMMING\\Java\\Eclipse\\JAVA\\Packet\\fileHandling.txt");
		try {
			if(f1.createNewFile()) {
				System.out.println("File already created");
			}
		}catch(IOException p) {
			System.out.println("Path is Incorrect");
		}

	}

}
