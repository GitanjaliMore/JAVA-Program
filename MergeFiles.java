package conn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MergeFiles {
	void MergeDemo() {
		String sourceFileName1 = "file1.txt";//Replace with the first source file name
		String sourceFileName2 = "file2.txt";//Replace with the second source file name
		String destinationFileName = "merged.txt";//replace with your destination file name
		
		try {
			//open the first source file for reading
			FileInputStream sourceFile1 = new FileInputStream(sourceFileName1);
			
			//open the second source file for reading
			FileInputStream sourceFile2 = new FileInputStream(sourceFileName2);
			
			//open the destination file for writing
			FileOutputStream destinationFile = new FileOutputStream(destinationFileName);
			
			//create buffer to hold data
			byte[] buffer = new byte[1024];
			int bytesRead;
			
			//Read from the first source file and write to the destination file
			while((bytesRead =sourceFile1.read(buffer))!=-1) {
				destinationFile.write(buffer,0,bytesRead);
			}
			
			//Read from the second source file and write to the destination file
			
			while((bytesRead =sourceFile2.read(buffer))!=-1) {
				destinationFile.write(buffer,0,bytesRead);
			
		}
			//close the files
			sourceFile1.close();
			sourceFile2.close();
			destinationFile.close();
			System.out.println("File merged successfully");
			
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MergeFiles mf = new MergeFiles();
			mf.MergeDemo();

	}
}


