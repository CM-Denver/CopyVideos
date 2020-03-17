package videos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyVideo {
	
	final int bufferSize = 8 * 1024;
	private String sourceFilePath = "";
	private String outputFilePath = "";
	
	public CopyVideo(String sourceFilePath, String outputFilePath) throws IOException {
		this.sourceFilePath = sourceFilePath;
		this.outputFilePath = outputFilePath;
		
		File sourceFile = new File(sourceFilePath);
		File outputFile = new File(outputFilePath);
		
		FileInputStream inStream = new FileInputStream(sourceFile);
		FileOutputStream outStream = new FileOutputStream(outputFile);
		
		byte[] buffer = new byte[bufferSize];
		
		while(inStream.available() != 0) {
			inStream.read(buffer);
			outStream.write(buffer);
		}
	}
	
}
