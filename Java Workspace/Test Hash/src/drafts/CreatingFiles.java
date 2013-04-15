package drafts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

public class CreatingFiles {

	
	public static void writeUUIDs(String directory, int number){
		String s = String.valueOf(number);
		Path writeFile = Paths.get(directory + "/UUID_"+s);
		
		Charset charset = Charset.forName("US-ASCII");	
		try {
			writeFile = Files.createFile(writeFile);
			BufferedWriter writer = Files.newBufferedWriter(writeFile, charset);
			
			try{
			    for(int i = 0 ; i<= number ; i++)
			    	writer.write(UUID.randomUUID().toString() + System.lineSeparator()); 
			} 
			finally{writer.close();}    
		} catch (IOException e1) {e1.printStackTrace();}
	}
	
	public static void writeNumbers(String directory, int number){
		String s = String.valueOf(number);
		Path writeFile = Paths.get(directory + "/Numbers_"+s);
		
		Charset charset = Charset.forName("US-ASCII");	
		try {
			writeFile = Files.createFile(writeFile);
			BufferedWriter writer = Files.newBufferedWriter(writeFile, charset);
			
			try{
			    for(int i = 0 ; i<= number ; i++)
			    	writer.write(Integer.toString(i)); 
			} 
			finally{writer.close();}    
		} catch (IOException e1) {e1.printStackTrace();}
	}
	
	
	public static void main(String[] args) {	
		writeUUIDs("/home/jonathan/Documents/Projet-INF431/Java Workspace/Test Hash", 200000);
	}

}