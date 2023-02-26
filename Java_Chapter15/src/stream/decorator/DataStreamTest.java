package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream bis = new DataInputStream(fis)){
			System.out.println(bis.readByte());
			System.out.println(bis.readChar());
			System.out.println(bis.readInt());
			System.out.println(bis.readFloat());
			System.out.println(bis.readUTF());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
