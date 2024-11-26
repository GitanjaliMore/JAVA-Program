package conn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyToTwoFile{
	void writeTwoDestinations() {
		String sourceFileName ="source.txt";//Replace with your source file name
		String destinationFileName1 = "destination1.txt";
		String destinationFileName2 = "destination2.txt";
		
		try {
			//open the source file for reading
			FileInputStream sourceFile = new FileInputStream(sourceFileName);
			
			//open the first destination file for writing
			FileOutputStream destinationFile1 = new FileOutputStream(destinationFileName1);
			
			//open the second destination file for writing
			FileOutputStream destinationFile2 = new FileOutputStream(destinationFileName2);
			
			//create a buffer to hold the data
			byte[] buffer = new byte[1024];
			int bytesRead;
			
			//read from the source file and write to the first destination file
			while((bytesRead = sourceFile.read(buffer))!=-1) {
				destinationFile1.write(buffer,0,bytesRead);
				destinationFile2.write(buffer,0,bytesRead);
			}
			
			//close all the files
			sourceFile.close();
			destinationFile1.close();
			destinationFile2.close();
			System.out.println("Data copied to two destination files successfully");
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyToTwoFile copy = new CopyToTwoFile();
		copy.writeTwoDestinations();
	}

}
