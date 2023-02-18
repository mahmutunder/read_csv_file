import java.io.*;

public class CsvTest {

	public static void main(String[] args) throws IOException
	{
		double average;
		int studentNumber=1;
		
		CsvRead testScore = new CsvRead("note.csv");
		
		while(testScore.readNextLine()) {
			average=testScore.getAverage();
			System.out.println("Average for student " +
			studentNumber + " is " + average);
			
			studentNumber++;
		}
		
		testScore.close();
		System.out.println("No more scores");

	}

}
