package fileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File f1=new File("D:\\PROGRAMMING\\Java\\Eclipse\\JAVA\\Packet\\fileHandling.txt");
		if(f1.exists()) {
			System.out.println("File Name: "+f1.getName());
			System.out.println("File path: "+f1.getAbsolutePath());
			System.out.println("File Can Read : "+f1.canRead());
			System.out.println("File Can Write : "+f1.canWrite());
			System.out.println("File Size : "+f1.length());
			System.out.println("Delete File : "+f1.delete());
		}else {
			System.out.println("File does not exists.....");
			
		}

		
	}

}
