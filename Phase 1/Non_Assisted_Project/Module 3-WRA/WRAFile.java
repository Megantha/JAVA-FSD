package Non_assisted;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WRAFile {
	
	public static void createFileUsingFileClass() throws IOException{
		File file= new File("D:\\files\\testFile23-07-22.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is Created");
		}
		else {
			System.out.println("File is already Exist");
		}
			
	}
	
	public static void writeFileWriterClass() throws IOException{
		
		FileWriter  writer= new  FileWriter("D:\\files\\testFile23-07-22.txt",false);//overWrites file
		//FileWriter  writer= new  FileWriter(file,true);//appends File
		writer.write("Welcome to java world.Happy Learning");
		writer.close();
		
		
		
	}
	
	public static void readFileReaderClass() throws IOException
	{
		
		FileReader reader= new FileReader("D:\\files\\testFile23-07-22.txt");
		
		int data;
		
		while((data=reader.read())!=-1){
		
		System.out.print((char)data);
		
		}
	}
	
	public static void appendFileAppendClass() throws IOException
	{
		FileWriter  writer= new  FileWriter("D:\\files\\testFile23-07-22.txt",true);//appends File
		writer.write("\nHappy java learn!");
		writer.close();
		
	}
	public static void main(String args[]) {
		
		
		
		try {
			createFileUsingFileClass();
			System.out.println("File created successfully");
			
			writeFileWriterClass();
			System.out.println("File written successfully");
			
			readFileReaderClass();
			System.out.println("\nFile readed successfully");
		
			appendFileAppendClass();
			System.out.println("File appended Successfully");
			
			//readFileReaderClass();
			//System.out.println("\nFile readed successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error"+e);
		}
	}
}
	

