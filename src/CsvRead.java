import java.io.*;
import java.util.Scanner;

public class CsvRead {
	
	// crate scanner to get filename
	private Scanner inputFile;
	
	// create string line to read the line
	private String line;
	private File file;
	
	
	// create constructor to get filename add throws exception
	public CsvRead(String fileName) throws IOException
	
	{
		
		// open file reader to get from construction
		 file = new File(fileName);
		// send input file to scanner to read
		inputFile= new Scanner(file);
		
	}
	
	// create boolean to see if nextLine exists
	public boolean readNextLine() throws IOException{
		
		// need boolean  with lineRead
		boolean lineRead;
		
		
		// assignment to lineRead to input file and get with has
		lineRead=inputFile.hasNext();
		
		// check with if it still true 
		if(lineRead) {
			line=inputFile.nextLine();
		}
		
		// return  next line
		return lineRead;
	}
	
	// calculate average with get method
	public double getAverage() {
		int total=0;
		double average;
		
		// need tokens array string to split and store it
		String[] tokens=line.split(",");
		
		// use for each loop to calculate
		for(String str: tokens) {
			total+=Integer.parseInt(str);
		}
		
		average=(double)total/tokens.length;
		
		return average;
	}
	
	public void close(){
		inputFile.close();
	}

}
