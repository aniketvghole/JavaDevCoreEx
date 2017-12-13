import java.io.File;
import java.io.
import java.io.FileIutputStream;
import java.io.InputStreamreader;
import java.io.IOException;
import java.net.URL;

import org.omg.CORBA_2_3.portable.OutputStream;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File path = new File("hello.txt");
		System.out.println("we got a file"+path);
		
		System.out.println("Does it exist?".path.exist());
		System.out.println("Wat"path.isDirectory());
		
		String contentsToWrite = "hello World";
		FileOutputStream outStream = new FileOutputStream(path);
		outStream.write(contentsToWrite.getBytes());
		outStream.close();
		
	}

}
