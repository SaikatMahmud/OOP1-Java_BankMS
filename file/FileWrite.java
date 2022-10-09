package file;
import java.lang.*;
import java.io.*;

public class FileWrite
{
	
	File folder;
	File file;
	private FileWriter writer;		
	private FileReader reader;		
			
	
	
	public void writeInFile(String s)
	{

		try
		{
			file = new File("Transaction Details.txt");			
			file.createNewFile();					
			writer = new FileWriter(file, true);	
			writer.write(s+"\r\n");				
			writer.flush();							
			writer.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	
}