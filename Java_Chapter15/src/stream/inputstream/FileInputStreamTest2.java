package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			int i;
			while((i = fis.read())!=-1 ) { // 문장이 끝나면 -1이 되기 때문
				System.out.println((char)i);
			}
			System.out.println("end");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
