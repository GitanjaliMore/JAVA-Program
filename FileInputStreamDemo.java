package conn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
//Read single character from file
	void FileInputDemo() throws IOException{
		try
		{
			FileInputStream fin = new FileInputStream("FileIn.txt");
			int i=fin.read();
			System.out.println((char)i);
			fin.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
	//Read all character from file
	void Readchars() throws IOException{
		try {
			FileInputStream fin = new FileInputStream("FileIn.txt");
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.println((char)i);
			}
			fin.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws IOException
	{
		FileInputStreamDemo findemo = new FileInputStreamDemo();
		findemo.FileInputDemo();
		findemo.Readchars();
	}
}
